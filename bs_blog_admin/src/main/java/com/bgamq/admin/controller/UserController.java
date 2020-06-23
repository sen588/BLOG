package com.bgamq.admin.controller;

import com.bgamq.admin.entity.User;
import com.bgamq.admin.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/2316:04
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("info/list")
    public void getList(){
        List<User> list = userService.findList();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
