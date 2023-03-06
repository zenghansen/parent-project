package zhs.com.ip_spring_boot_starter.interceptor;

import zhs.com.ip_spring_boot_starter.service.IpCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IpCountInterceptor implements HandlerInterceptor {

    @Autowired
    private IpCountService ipCountService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        ipCountService.count();
        Exception e = new Exception("this is a log");
        e.printStackTrace();
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
