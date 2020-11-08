package com.jason.lee.controller;

import com.jason.lee.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/25
 */
//控制器增强
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        /**
         * 传入我们自己的错误状态码  4xx 5xx
         * Integer statusCode = (Integer) request
         .getAttribute("javax.servlet.error.status_code");
         */
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user.notExist");
        map.put("message","用户出错啦");
        request.setAttribute("extMsg",map);
        //转发到/error
        return "forward:/error";
    }
}

