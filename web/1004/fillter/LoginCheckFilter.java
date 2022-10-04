package org.zerock.w0929.fillter;


import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginCheckFilter", urlPatterns = {"/todo/*"})
@Log4j2
public class LoginCheckFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        log.info("init....");
    }

    public void destory(){
        log.info("destory...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        log.info("dofilter............................");
        log.info("dofilter............................");
        log.info("dofilter............................");
        log.info("dofilter............................");

        // downcastiong
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;

        // todoAddcontroller에 있던 login 처리부분 잘라서 가져옴
        HttpSession session =req.getSession(false);

        //login(get)을 하지 않았던 유저
        if(session==null){
            res.sendRedirect("/login");
            return;
        }

        // login(get)은 했었는데 가간이 만료된 유저
        if(session.getAttribute("loginResult")==null){
            res.sendRedirect("/login");
            return;
        }

        chain.doFilter(request,response);
    }
}
