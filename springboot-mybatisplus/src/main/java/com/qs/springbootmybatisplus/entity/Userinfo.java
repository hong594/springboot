package com.qs.springbootmybatisplus.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (Userinfo)表实体类
 *
 * @author makejava
 * @since 2023-02-22 17:24:38
 */
@SuppressWarnings("serial")
@Data
public class Userinfo extends Model<Userinfo> {

    private String username;

    private String userimg;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.username;
    }
}

