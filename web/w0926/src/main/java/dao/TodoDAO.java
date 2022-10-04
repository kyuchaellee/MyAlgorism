package dao;

import dto.TodoDTO;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public enum TodoDAO {
    INSTANCE;
    private final String INSERT = "INSERT INTO tbl_todo (title,memo,dueDate) VALUES (?,?,?)";
    private final String DELETE = "DELETE FROM tbl_todo WHERE tno=?";

    private final String UPDATE = "update tbl_todo set title = ?,memo=?,moddate=now(),duedate=?,complete=? where tno=?";
    private final String Last = "select last_insert_id()";


    public List<TodoDTO> list(int page, int size)throws  Exception{
        StringBuffer buffer =
                new StringBuffer("select * from tbl_todo where tno>0 order by tno desc limit ?,?");

        int skip = ( page < 0 ? 1 : page-1 ) * size;
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(buffer.toString());
        preparedStatement.setInt(1,skip);
        preparedStatement.setInt(2,size);

        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
        List<TodoDTO> list = new ArrayList<>();
        while(resultSet.next()){
            TodoDTO dto = TodoDTO.builder()
                    .tno(resultSet.getInt("tno"))
                    .title(resultSet.getString("title"))
                    .memo(resultSet.getString("memo"))
                    .dueDate(resultSet.getDate("dueDate").toLocalDate())
                    .complete(resultSet.getBoolean("complete"))
                    .regDate(resultSet.getTimestamp("regDate").toLocalDateTime())
                    .modDate(resultSet.getTimestamp("modDate").toLocalDateTime())
                    .build();
            list.add(dto);
        }
        return list;
    }
    public Integer insert(TodoDTO todoDTO)throws Exception{
        Integer result = null;
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement
                = connection.prepareStatement(INSERT);

        preparedStatement.setString(1,todoDTO.getTitle());
        preparedStatement.setString(2,todoDTO.getMemo());
        preparedStatement.setDate(3, Date.valueOf(todoDTO.getDueDate()));
        int count = preparedStatement.executeUpdate();
        if(count != 1){
            throw new Exception("insert error");
        }
        preparedStatement.close();
        preparedStatement = connection.prepareStatement(Last);
        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();

        result = resultSet.getInt(1);

        return result;
    }

    public Integer Delete(TodoDTO todoDTO)throws Exception{
        Integer result = null;
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement
                = connection.prepareStatement(DELETE);

        preparedStatement.setInt(1,todoDTO.getTno());
        int count = preparedStatement.executeUpdate();
        if(count != 1){
            throw new Exception("delete error");
        }
        preparedStatement.close();
        preparedStatement = connection.prepareStatement(Last);
        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();

        result = resultSet.getInt(1);

        return result;
    }

    public Integer update(TodoDTO todoDTO)throws Exception{
        Integer result = null;
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement
                = connection.prepareStatement(UPDATE);

        preparedStatement.setString(1,todoDTO.getTitle());
        preparedStatement.setString(2,todoDTO.getTitle());
        preparedStatement.setDate(3, Date.valueOf(todoDTO.getDueDate()));
        preparedStatement.setBoolean(4, todoDTO.isComplete());
        preparedStatement.setInt(5,todoDTO.getTno());

        int count = preparedStatement.executeUpdate();
        if(count != 1){
            throw new Exception("update error");
        }
        preparedStatement.close();
        preparedStatement = connection.prepareStatement(Last);
        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();

        result = resultSet.getInt(1);

        return result;
    }
}
