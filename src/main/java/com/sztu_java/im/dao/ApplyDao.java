package com.sztu_java.im.dao;

import com.sztu_java.im.pojo.Apply;
import com.sztu_java.im.pojo.User;

import java.util.List;

public interface ApplyDao {
    int add(Apply apply);

    List<User> getFriends(Long id);
}
