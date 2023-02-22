package com.qs.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qs.springbootmybatisplus.dao.UserinfoDao;
import com.qs.springbootmybatisplus.entity.Userinfo;
import com.qs.springbootmybatisplus.service.UserinfoService;
import org.springframework.stereotype.Service;

/**
 * (Userinfo)表服务实现类
 *
 * @author makejava
 * @since 2023-02-22 17:24:38
 */
@Service("userinfoService")
public class UserinfoServiceImpl extends ServiceImpl<UserinfoDao, Userinfo> implements UserinfoService {

}

