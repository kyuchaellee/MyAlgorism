package org.zerock.w0930.controller;


import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
@WebServlet(name = "kioskOrderCheckController", value = "/kiosk/ordercheck")
public class kioskOrderCheckController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    
        req.getRequestDispatcher("/WEB-INF/views/kiosk/orderCheck.jsp")
                .forward(req,resp);

    }
}
