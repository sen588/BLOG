package com.bgamq.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "/get")
    public String admin() {
        return "gateway";
    }

}
