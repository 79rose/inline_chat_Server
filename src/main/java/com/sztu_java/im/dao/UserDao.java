package com.sztu_java.im.dao;

import com.sztu_java.im.pojo.User;

public interface UserDao {

    public User getUserByUserName(String username);
} 