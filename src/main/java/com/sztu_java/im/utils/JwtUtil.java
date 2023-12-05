// package com.sztu_java.im.utils;

// import com.alibaba.fastjson.JSON;
// import com.sztu_java.im.pojo.User;
// import io.jsonwebtoken.Claims;

// import com.alibaba.fastjson.JSON;
// import com.sztu_java.im.pojo.User;
// import io.jsonwebtoken.Claims;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;
// import org.springframework.stereotype.Component;

// import java.util.Date;
// import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.Map;

// @Component
// public class JwtUtil {

//     /**
//      * 用户登录成功后生成Jwt
//      * 使用Hs512算法，私钥使用用户密码
//      *
//      * @return
//      */
//     public String createJWT(User user) {
//         Map<String, Object> map = new HashMap<>();
//         map.put("user", user);
//         return generatorToken(map);
//     }

//     private String generatorToken(Map<String, Object> map) {
//         return Jwts.builder()
//                 .setClaims(map)
//                 .setExpiration(generatorExpiration())
//                 .signWith(SignatureAlgorithm.HS512, "232312fjwaijfoa".getBytes())
//                 .compact();
//     }

//     public User getToken(String token) {
//         Claims body = Jwts.parser()
//                 .setSigningKey("232312fjwaijfoa".getBytes())
//                 .parseClaimsJws(token)
//                 .getBody();
//         LinkedHashMap<String, Object> user = (LinkedHashMap<String, Object>) body.get("user");
//         return JSON.parseObject(JSON.toJSONString(user), User.class);
//     }

//     private Date generatorExpiration() {
//         return new Date(System.currentTimeMillis() + 9000000);
//     }
// }

// 模拟创建一个假的jwt工具类 返回一个假的token
package com.sztu_java.im.utils;

import com.alibaba.fastjson.JSON;

import com.sztu_java.im.pojo.User;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    
// 创建token 
public Object createJWT(User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("user", user);
        return generatorToken(map);
    }

    private  Object generatorToken(Map<String, Object> map) {
        String token =   JSON.toJSONString(map);
        // 返回一个对象 包含user 和 token
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("user", map.get("user"));
        obj.put("token", token);
        return obj;
        
    }
    
    // 解析token
    public User getToken(String Font_token) {
        Map<String, Object> map = JSON.parseObject(Font_token, Map.class);
        // System.out.println(map);
        String user = map.get("user").toString();
        // System.out.println(user);
        return JSON.parseObject(user, User.class);
    }
}