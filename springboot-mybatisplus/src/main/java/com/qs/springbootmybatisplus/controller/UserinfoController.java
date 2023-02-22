package com.qs.springbootmybatisplus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qs.springbootmybatisplus.entity.Userinfo;
import com.qs.springbootmybatisplus.service.UserinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Userinfo)表控制层
 *
 * @author makejava
 * @since 2023-02-22 17:24:38
 */
@RestController
@RequestMapping("userinfo")
public class UserinfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UserinfoService userinfoService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param userinfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Userinfo> page, Userinfo userinfo) {
        return success(this.userinfoService.page(page, new QueryWrapper<>(userinfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.userinfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userinfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Userinfo userinfo) {
        return success(this.userinfoService.save(userinfo));
    }

    /**
     * 修改数据
     *
     * @param userinfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Userinfo userinfo) {
        return success(this.userinfoService.updateById(userinfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.userinfoService.removeByIds(idList));
    }
}

