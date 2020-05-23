package com.bgamq.sso.feign;

import com.bgamq.core.bean.Resp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "bs-blog-core")
public interface AdminFeign {

    @GetMapping("/login")
    Resp<Map<String, Boolean>> login();
}
