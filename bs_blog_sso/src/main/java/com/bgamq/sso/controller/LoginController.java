package com.bgamq.sso.controller;

import com.bgamq.sso.utils.GuliJwtUtils;
import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.UUID;

@RestController
public class LoginController {

    @GetMapping("/get")
    public String get() {
        return "get";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "redirect_url", required = false) String redirectUrl,
                              Model model) {
        model.addAttribute("redirectUrl", redirectUrl);
        return null;
    }

    @PostMapping("/doLogin")
    public String doLogin(String username, String password, String redirectUrl,
                          HttpServletResponse response, Model model) {
        //判断登录名
        if (true) {
            String tokeUuid = UUID.randomUUID().toString().substring(0, 5);
            HashMap<String, Object> map = new HashMap<>();

            map.put("username", username);
            map.put("password", password);
            map.put("tokeUuid", tokeUuid);
            DefaultClaims defaultClaims = new DefaultClaims();
            //jwt生成字符串
            String jwt = GuliJwtUtils.buildJwt(map, defaultClaims);
            Cookie cookie = new Cookie("blogCookie", jwt);
            response.addCookie(cookie);
            //登陆成功返回
            return String.format("redirect:%s?blogCookie=%s", redirectUrl, jwt);
        }
        model.addAttribute("username", username);
        return String.format("forward:login?redirect_url=%s", redirectUrl);
    }
}
