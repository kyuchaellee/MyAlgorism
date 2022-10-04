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


        //openSession(boolean) : SqlSession 생성시 AutoCommit여부를  true/false로 지정가능
        SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        // mapper.xml에서 선언한 쿼리구문을 SqlSession에서 실행함(6가지 메서드 존재)
        // selectList() : 결과에 대한 값을 List로 받고자 할때 사용
        List<ProductDTO> dtoList = session.selectList("org.zerock.w0930.dao.KioskMapper.selectProduct");

        // Controller에서 View로 데이터를 전달하는 코드
        // 1. request 객체에 속성을 key-value 형태로 담음
        request.setAttribute("list",dtoList);

        // RequestDispatcher 설정
        // 2. order.jsp로 forwarding 함
        request.getRequestDispatcher("/WEB-INF/views/kiosk/order.jsp")
                .forward(request,response);


        dtoList.forEach(ProductDTO -> log.info(ProductDTO));
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //menuNumber, amount 를 order





    }
}
