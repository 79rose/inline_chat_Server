package com.sztu_java.im.dao;

import com.sztu_java.im.pojo.Message;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

public interface MessageDao {
    List<Map> list(@Param("from")Long id,@Param("to")Long to);
    int add(Message message);
}
