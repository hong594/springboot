package com.qs.springbootmybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qs.springbootmybatisplus.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Userinfo)表数据库访问层
 *
 * @author makejava
 * @since 2023-02-22 17:24:38
 */
@Mapper
public interface UserinfoDao extends BaseMapper<Userinfo> {

}

