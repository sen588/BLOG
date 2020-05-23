package com.bgamq.sso.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "bs_blog_core")
public interface AdminFeign {
}
