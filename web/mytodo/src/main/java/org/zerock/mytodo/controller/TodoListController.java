package org.zerock.mytodo.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.zerock.mytodo.dao.MyBatisUtil;
import org.zerock.mytodo.dto.TodoDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TodoListController", value = "/todo/list")
@Log4j2
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //sql 세션 연결 = connect,prepare,resultset 까지 한방에
        SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        // 목록을 가져 오니까 selectList 해주고 경로 적어주고 .id 값을 넣어준다 여기서 id는 mapper에 쿼리문 적을때 id 설정해준  것.
        List<TodoDTO> dtoList =  session.selectList("org.zerock.mytodo.dao.TodoMapper.selectList");


        request.setAttribute("list",dtoList);
        request.getRequestDispatcher("/WEB-INF/views/todo/list.jsp").forward(request,response);

        dtoList.forEach(todoDTO -> log.info(todoDTO));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
