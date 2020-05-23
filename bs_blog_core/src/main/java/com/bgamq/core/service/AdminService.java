package com.bgamq.core.service;

import com.bgamq.core.vo.RegisterVO;

public interface AdminService {
    boolean getUsernameAndPasswordById(RegisterVO register);
}
