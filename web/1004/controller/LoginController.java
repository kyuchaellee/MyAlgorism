package com.example.todolist.controller;

import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/login")
@Log4j2
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("Login get.......");

        request.getRequestDispatcher("/WEB-INF/views/member/login.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("login post...");

        String mid = req.getParameter("mid");
        String mpw = req.getParameter("mpw");

        log.info(mid);
        log.info(mpw);

        //로그인 처리
        if(mid.equals("aaa")&&mpw.equals("111")){
            HttpSession session = req.getSession();
            session.setAttribute("loginResult","success");
            resp.sendRedirect("/hello");
            return;
        }
        log.info("login failed....");

        resp.sendRedirect("/login?error=fail");

    }
}
