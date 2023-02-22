package com.qs.springbootexception.exceptions;

import com.qs.springbootexception.pojo.ExceptionVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jyh
 * @date 2023/2/22 - 9:18
 */
@RestController
public class ExceptionControllerHander {
    /**
     * 处理异常注解,当括号中value指定的异常发生时，就会调用这个注解下面的方法
     */
    @ExceptionHandler(value = Exception.class)
    public Object golobalException(Exception e, HttpServletRequest request) {
        //得到请求的地址
        String url = request.getRequestURI();
        //得到错误信息
        String msg = e.getMessage();
        return new ExceptionVO(500, url, msg);
    }
}
