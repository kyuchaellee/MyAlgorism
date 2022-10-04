package org.zerock.w0930.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.zerock.w0930.dao.MyBatisUtil;
import org.zerock.w0930.dto.ProductDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@Log4j2
@WebServlet(name = "kioskOrderController", value = "/kiosk/order")
public class kioskOrderController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        List<ProductDTO> dtoList = session.selectList("org.zerock.w0930.dao.KioskMapper.selectProduct");

        request.setAttribute("list",dtoList);
        request.getRequestDispatcher("/WEB-INF/views/kiosk/order.jsp")
                .forward(request,response);

        dtoList.forEach(todoDTO -> log.info(todoDTO));
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
