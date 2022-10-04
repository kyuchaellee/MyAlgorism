package org.zerock.w0929.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet( name="LogoutController" ,value="/logout")
public class LogoutController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //getSession() : session을 다시 만들지 여부 파악
        HttpSession session =req.getSession(false);

        //
        if(session==null){
            resp.sendRedirect("/hello");
            return;
        }

        // logout 방식1 = session 무효화
        session.invalidate();

        // logout 방식2 = 갈비지 컬랙션 마킹
        session.setMaxInactiveInterval(0);



    }

}