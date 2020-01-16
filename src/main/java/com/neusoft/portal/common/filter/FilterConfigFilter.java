package com.neusoft.portal.common.filter;

import java.util.logging.LogRecord;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName: FilterConfigFilter
 * @Description: 过滤器
 * @Author: guohj_sr
 * @Date: 2019/12/19
 */
public class FilterConfigFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();

        res.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        res.setHeader("Access-Control-Max-Age", "3600");
        res.setHeader("Access-Control-Allow-Headers", "x-requested-with,Cache-Control,Pragma,Content-Type,Token");
        // 是否支持cookie跨域
        res.setHeader("Access-Control-Allow-Credentials","true");

        // 如果session不为空，则可以浏览其他页面
        if ((!("/login/checkLogin").equals(req.getServletPath()))
                && (!("/homepage/upload").equals(req.getServletPath()))
                && (!("/homepage/uploadFiles").equals(req.getServletPath()))
                && (!("/ossUpload").equals(req.getServletPath()))
                && (!("/ossDelelte").equals(req.getServletPath()))
                && (!("/swagger-ui.html").equals(req.getServletPath()))
                && (!req.getServletPath().startsWith("/webjars/"))
                && (!req.getServletPath().startsWith("/swagger-resources"))
                && (!req.getServletPath().startsWith("/v2/api-docs"))
                && (!("/partner/trunk/excelImportTrunkInfo").equals(req.getServletPath()))) {
//            User loginUser = (User) session.getAttribute(StaticConstants.USER_SESSION);
//            if (null == loginUser) {
//
//                res.setContentType("text/html;charset=utf-8");
//                PrintWriter prw = res.getWriter();
//                prw.print(JsonUtil.toString(ResponseVo.buildFailInstance(0, "session失效，请重新登录！")));
//            } else {
                filterChain.doFilter(servletRequest, servletResponse);
//            }
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}

