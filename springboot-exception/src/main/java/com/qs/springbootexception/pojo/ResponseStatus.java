package com.qs.springbootexception.pojo;

/**
 * @author jyh
 * @date 2023/2/22 - 10:03
 */
public enum ResponseStatus { //模拟HttpStatus枚举类
    OK(200, "请求成功"), INTERNAL_ERROR(500, "服务器内部错误"), LOGIN_ERROR(500001, "账号或密码错误"), BUSINESS_ERROR(500002, "业务错误"), AUTHORITY_ERROR(500003, "授权错误"), AUTHENTICATE_ERROR(403, "验证错误，需要登录"), Find_NULL(500088, "没有记录");

    private int code;
    private String message;

    ResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
