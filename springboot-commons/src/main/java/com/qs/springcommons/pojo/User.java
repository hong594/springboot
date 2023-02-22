package com.qs.springcommons.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jyh
 * @date 2023/2/21 - 10:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String usrname;
    private String password;
}
