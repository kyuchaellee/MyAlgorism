package org.zerock.dao;

import dao.ConnectionUtil;
import lombok.Cleanup;
import org.junit.jupiter.api.Test;
import java.sql.*;

public class ConnectTests {
    @Test
    public void testconnect100() throws Exception {

        long start = System.currentTimeMillis();

        //드라이버 로딩
        Class.forName("org.mariadb.jdbc.Driver");

        for (int i = 0; i < 100; i++) {

            //커넥션
            @Cleanup Connection connection =
                ConnectionUtil.INSTANCE.getConnection();
            String query = "select now()";
            //쿼리
            @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(query);
            @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String str = resultSet.getString(1);

            System.out.println(str);

            //close()

        }//end for

        long end = System.currentTimeMillis();

        long gap = end - start;

        System.out.println("TIME: " + gap);

    }


    @Test
    public void testconnectDS() throws Exception {
        //드라이버 로딩
        Class.forName("org.mariadb.jdbc.Driver");
        //커넥션
        Connection connection =
                ConnectionUtil.INSTANCE.getConnection();
        String query = "select now()";
        //쿼리
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        String str = resultSet.getString(1);

        System.out.println(str);

        //close()
    }
}
