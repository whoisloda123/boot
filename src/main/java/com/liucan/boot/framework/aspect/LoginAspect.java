package com.liucan.boot.framework.aspect;

import com.liucan.boot.framework.annotation.LoginCheck;
import com.liucan.boot.framework.annotation.UserId;
import com.liucan.boot.web.common.CommonResponse;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 可以用aop实现
 * 也可以用interceptor实现
 * 原则上都是拦截方法
 * @author liucan
 * @version 18-12-8
 */
@Component
@Aspect
public class LoginAspect {
    private final HttpServletRequest request;

    public LoginAspect(HttpServletRequest request) {
        this.request = request;
    }

    private Integer userId() {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equalsIgnoreCase("uid")) {
                    return Integer.valueOf(cookie.getValue());
                }
            }
        }
        return null;
    }

    @Around("@annotation(com.liucan.boot.framework.annotation.LoginCheck)")
    private Object aroundLogin(ProceedingJoinPoint jp) throws Throwable {
        try {
            Integer userId = userId();
            Object[] args = jp.getArgs();
            Method method = ((MethodSignature) jp.getSignature()).getMethod();

            if (method.getAnnotation(LoginCheck.class).required() && userId == null) {
                return CommonResponse.error(403, "未登录");
            }

            Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                if (parameters[i].isAnnotationPresent(UserId.class)) {
                    args[i] = userId;
                }
            }
            return jp.proceed(args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
