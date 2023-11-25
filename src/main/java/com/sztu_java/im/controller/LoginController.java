package com.sztu_java.im.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sztu_java.im.service.LoginService;
import com.sztu_java.im.utils.ResponseUtils;

@RestController
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private LoginService loginService;
    
    @PostMapping
    public Object login(@RequestBody Map<String, String> map) {
        // return loginService.login(username, password);
        if (CollectionUtils.isEmpty(map)) {
            System.out.println("参数不对");
            return ResponseUtils.badArgument();

        }
        System.out.println(map);
        return loginService.login(map);
    }
}