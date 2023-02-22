package com.qs.springbootredis.controller;

import com.qs.springcommons.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jyh
 * @date 2023/2/21 - 10:03
 */
@RestController
public class UserController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/user")
    public String user(User user){
        return "user";
    }

    @RequestMapping("/redis")
    public String redis(){
        String str = "redis测试";
        stringRedisTemplate.opsForValue().set("mag20230221",str);
        return "ok";
    }

    @RequestMapping("/getRedis")
    public String getRedis(){
        stringRedisTemplate.opsForValue().get("mag20230221");
        return "ok";
    }
}
