package com.sztu_java.im.dao;

import com.sztu_java.im.pojo.Friend;
import com.sztu_java.im.pojo.User;

import java.util.List;
import java.util.Map;

public interface FriendDao {
    List<User> list(Long id);

    int add(Friend friend);
}
