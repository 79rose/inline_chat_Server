package com.sztu_java.im.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sztu_java.im.dao.MessageDao;
import com.sztu_java.im.pojo.Message;
import com.sztu_java.im.pojo.User;
import com.sztu_java.im.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.awt.*;
import java.util.Map;

@Service
public class MessageService {

    @Autowired
    private MessageDao messageDao;

    public Object list(User user, Long to, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Map> list = messageDao.list(user.getId(), to);
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("total", PageInfo.of(list).getTotal());
        return ResponseUtils.ok(map);
    }

    public Object add(Message message) {
        message.setType(1);
        message.setTime(new Date());
        messageDao.add(message);
        return ResponseUtils.ok();
    }


}
