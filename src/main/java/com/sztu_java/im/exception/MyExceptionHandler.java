package com.sztu_java.im.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sztu_java.im.utils.ResponseUtils;
import com.sztu_java.im.utils.TokenExcption;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;

public class MyExceptionHandler {
    
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object exceptionHandler(HttpServletRequest req, Exception e) {
        e.printStackTrace();
        if (e instanceof TokenExcption){
            return ResponseUtils.unlogin();
        }else if (e instanceof MalformedJwtException) {
            return ResponseUtils.unlogin();
        }else if (e instanceof ExpiredJwtException){
            return ResponseUtils.unlogin();
        }else {
            return ResponseUtils.fail();
        }
    }
}