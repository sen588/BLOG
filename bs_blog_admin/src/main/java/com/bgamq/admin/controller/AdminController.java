package com.bgamq.admin.controller;

import io.swagger.annotations.Api;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;



@Api(tags = "用户信息管理")
@RestController
@RequestMapping(value = "/admin")
@RefreshScope   //支持nacos的动态刷新功能
public class AdminController {
//
//    @Resource
//    private AdminService adminService;
//
//    /**
//     * 信息
//     */
//    @ApiOperation("详情查询")
//    @GetMapping("/info/{id}")
//    public Resp<TAdmin> info(@PathVariable("id") Long id){
//        TAdmin admin = adminService.getById(id);
//
//        return Resp.ok(admin);
//    }
//
//    /**
//     * 保存
//     */
//    @ApiOperation("保存")
//    @PostMapping("/save")
//    public Resp<Object> save(@RequestBody TAdmin admin){
//        adminService.save(admin);
//
//        return Resp.ok(null);
//    }
//
//    /**
//     * 修改
//     */
//    @ApiOperation("修改")
//    @PostMapping("/update")
//    public Resp<Object> update(@RequestBody TAdmin admin){
//        adminService.updateById(admin);
//
//        return Resp.ok(null);
//    }
//
//    /**
//     * 删除
//     */
//    @ApiOperation("删除")
//    @PostMapping("/delete")
//    public Resp<Object> delete(@RequestBody Long[] ids){
//        adminService.removeByIds(Arrays.asList(ids));
//
//        return Resp.ok(null);
//    }
}
