package com.qs.springbootexception.controller;

import com.qs.springbootexception.pojo.ResponseResult;
import com.qs.springbootexception.pojo.ResponseStatus;
import com.qs.springcommons.pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jyh
 * @date 2023/2/22 - 9:59
 */
@RestController
public class ProductController {

    @RequestMapping("/get")
    public String get() {
        System.out.println(1 / 0);
        return "get";
    }

    //1.我们先看一个查询，返回的数据,此处一般不应该只返回数据，同时还要返回比如消息，状态码之类的提示
    @RequestMapping("/find")
    public User findOne() {
        return new User("admin", "12345");
    }

    //2.spring提供了一个叫ResponseEntity,可以封装除数据外，还提交一个枚举类，里面存储状态码及消息提示，共3个信息
    @RequestMapping("/find2")
    public ResponseEntity<User> findOne2() {
        return new ResponseEntity<User>(new User("admin", "12345"), HttpStatus.OK);
        //return new User("admin","12345");
    }

    //3.我们也可以尝试自己写，创建一个类型于ResponseEntity的封装三个信息的类比如ResponseResult,
    //再编写一个存储状态码和消息的枚举类ResponseStatus
    @RequestMapping("/find3")
    public ResponseResult<User> findOne3() {
        return new ResponseResult<User>(ResponseStatus.OK, new User("admin", "12345"));
        //return new User("admin","12345");
    }

    //4.测试返回错误或者正确信息
    @RequestMapping("/find4")
    public ResponseResult findOne4() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 0; i++) {//模拟从数据库中取数据
            User user = new User("admin" + i, "12345" + i);
            users.add(user);
        }
        if (users.size() > 0) {//查询出来了
            return ResponseResult.ok(users);
        } else {//没有数据
            return ResponseResult.error(ResponseStatus.Find_NULL);
        }
        //return new User("admin","12345");
    }
}
