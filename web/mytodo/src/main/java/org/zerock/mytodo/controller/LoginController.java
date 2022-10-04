package org.zerock.mytodo.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.zerock.mytodo.dao.MyBatisUtil;
import org.zerock.mytodo.dto.MemberDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/login")
@Log4j2
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);
        String mid = request.getParameter("mid");
        log.info(mid);
        String mpw = request.getParameter("mpw");
        log.info(mpw);
        MemberDTO memberDTO = new MemberDTO().builder().mid(mid).mpw(mpw).build();
        log.info(memberDTO);
        try {
            MemberDTO memberDTO2 = session.selectOne("org.zerock.mytodo.dao.MemberMapper.check", memberDTO);
            log.info(memberDTO2);

            HttpSession session2 = request.getSession();
            session2.setAttribute("loginResult", "success");

            if(session2.getAttribute("wanted") != null){
                response.sendRedirect((String)session2.getAttribute("wanted"));
                session2.removeAttribute("wanted");
            }else {
                response.sendRedirect("/todo/list");
            }
            return;

        }catch (Exception e){
            response.sendRedirect("/login?error=failed");
        }


    }
}
