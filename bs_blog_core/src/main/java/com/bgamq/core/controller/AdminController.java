package com.bgamq.core.controller;

import com.bgamq.core.bean.Resp;
import com.bgamq.core.mapper.TAdminMapper;
import com.bgamq.core.service.AdminService;
import com.bgamq.core.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    public Resp<Map<String, Boolean>> login() {
        Map<String, Boolean> map = new HashMap();
        map.put("bool", adminService.getUsernameAndPasswordById(null));
        return Resp.ok(map);
    }
}
