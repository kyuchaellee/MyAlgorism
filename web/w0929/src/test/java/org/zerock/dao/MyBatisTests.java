package org.zerock.dao;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.zerock.w0929.dao.MyBatisUtil;
import org.zerock.w0929.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;

@Log4j2
public class MyBatisTests {

    @Test
    public void test1(){
        log.info("test1..........");

        SqlSession session  = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession();

        log.info(session);

        String timeStr = session.selectOne("org.zerock.w0929.dao.TimeMapper.getTime");

        log.info(timeStr);


        session.close();
    }

    @Test
    public void testSelectAll() {

        @Cleanup SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        List<TodoDTO> dtoList = session.selectList("org.zerock.w0929.dao.TodoMapper.selectAll",
                PageRequestDTO.builder().build());

        return dtoList;
        dtoList.forEach(todoDTO -> log.info(todoDTO));


    }


    @Test
    public void testInsert() {

        TodoDTO dto = TodoDTO.builder().title("MyBatis Tests").memo("TEsts...").dueDate(LocalDate.now()).build();

        SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        session.insert("org.zerock.w0929.dao.TodoMapper.insert", dto);


    }

}
