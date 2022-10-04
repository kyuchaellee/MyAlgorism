package controller;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/hello2022.jsp");

        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("doPost---------------");
        System.out.println(request.getParameter("name"));


        response.sendRedirect("/todo/list");
    }

    public void destroy() {
    }
}

// 1988 년 때나 하는 코드
// response.setContentType("text/html");
//
//         System.out.println("한글 테스트 해 주면서~");
//
//         // Hello
//         PrintWriter out = response.getWriter();
//         out.println("<html><body>");
//         out.println("<h1>" + message + "</h1>");
//
//         out.println("</body></html>");