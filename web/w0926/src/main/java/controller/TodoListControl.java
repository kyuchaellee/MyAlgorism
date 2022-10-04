package controller;

import dao.TodoDAO;
import dto.TodoDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TodoListControl", value = "/todo/list")
public class TodoListControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            List<TodoDTO> data = TodoDAO.INSTANCE.list(1,70);
            request.setAttribute("list",data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        request.getRequestDispatcher("/WEB-INF/views/todo/list.jsp")
                .forward(request,response);
    }

}
