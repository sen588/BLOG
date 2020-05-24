package com.bgamq.sso.feign;

import com.bgamq.core.bean.Resp;
import com.bgamq.core.entity.TAdmin;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bs-blog-admin")
public interface AdminFeign {

    @GetMapping("/info/{id}")
    Resp<TAdmin> info(@PathVariable("id") Long id);
}
