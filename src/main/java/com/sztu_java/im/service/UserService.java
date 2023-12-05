package com.sztu_java.im.service;

import com.sztu_java.im.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public Object getUserByUserName(String username) {
        return userDao.getUserByUserName(username);
    }
    public Object getUserById(Integer id) {
        return userDao.getUserById(id);
    }
}
