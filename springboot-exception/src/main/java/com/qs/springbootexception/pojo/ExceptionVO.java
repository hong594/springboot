package com.qs.springbootexception.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jyh
 * @date 2023/2/22 - 9:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionVO {
    private int code;
    private String url;
    private String msg;
}
