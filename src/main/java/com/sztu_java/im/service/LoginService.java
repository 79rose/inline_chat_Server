package com.sztu_java.im.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sztu_java.im.pojo.User;
import com.sztu_java.im.utils.JwtUtil;

@Service
public class LoginService {

    @Autowired
    private com.sztu_java.im.dao.UserDao userDao;

    @Autowired
    private JwtUtil jwtUtil;

    public Object login(Map<String, String> map) {
        String username = map.get("username");
        String password = map.get("password");
        User user = userDao.getUserByUserName(username);

        if (user == null) {
            return com.sztu_java.im.utils.ResponseUtils.username();
        }
        if (!user.getPassword().equals(password)) {
            return com.sztu_java.im.utils.ResponseUtils.username();
        }
        return com.sztu_java.im.utils.ResponseUtils.ok(jwtUtil.createJWT(user));
    }
    
}
