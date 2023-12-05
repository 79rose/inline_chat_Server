package com.sztu_java.im.controller;

import com.sztu_java.im.annotaion.LoginUser;
import com.sztu_java.im.pojo.User;
import com.sztu_java.im.service.UserService;
import com.sztu_java.im.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Object User(@LoginUser User user) {
        System.out.println(user);
        return ResponseUtils.ok(user);
    }

    @GetMapping("/getUserByUserName")
    public Object getUserByUserName(String username) {
        return ResponseUtils.ok(userService.getUserByUserName(username));
    }
    @GetMapping("/getUserById")
    public Object getUserById(Integer id) {
        return ResponseUtils.ok(userService.getUserById(id));
    }




}
