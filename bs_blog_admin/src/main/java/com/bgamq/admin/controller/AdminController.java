package com.bgamq.admin.controller;

import com.bgamq.admin.service.AdminService;
import com.bgamq.core.bean.Resp;
import com.bgamq.core.entity.TAdmin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


@Api(tags = "用户信息管理")
@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    public Resp<TAdmin> info(@PathVariable("id") Long id){
        TAdmin admin = adminService.getById(id);

        return Resp.ok(admin);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    public Resp<Object> save(@RequestBody TAdmin admin){
        adminService.save(admin);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    public Resp<Object> update(@RequestBody TAdmin admin){
        adminService.updateById(admin);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    public Resp<Object> delete(@RequestBody Long[] ids){
        adminService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }
}
