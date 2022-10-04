package org.zerock.w0930.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.zerock.w0930.dao.MyBatisUtil;
import org.zerock.w0930.dto.ProductDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

@Log4j2
@WebServlet(name = "kioskOrderDetailController", value = "/kiosk/orderdetail")
public class kioskOrderDetailController extends HttpServlet {
    Map<String,Object> map = new HashMap<String,Object>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int menuNum = parseInt(request.getParameter("menuNumber"));
        int price = parseInt(request.getParameter("amount"));
        SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        List<ProductDTO> dtoList = session.selectList("org.zerock.w0930.dao.KioskMapper.selectProduct");
        map.put("MenuNumber",menuNum);

        ProductDTO productDTO = session.selectOne("org.zerock.w0930.dto.ProductDTO.selectDetail",map);

        log.info(menuNum);
        log.info(price);

        request.getRequestDispatcher("/WEB-INF/views/kiosk/orderDetail.jsp")
                .forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
