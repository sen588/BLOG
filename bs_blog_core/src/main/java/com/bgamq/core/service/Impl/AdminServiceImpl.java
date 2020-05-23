package com.bgamq.core.service.Impl;

import com.bgamq.core.mapper.TAdminMapper;
import com.bgamq.core.service.AdminService;
import com.bgamq.core.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public boolean getUsernameAndPasswordById(RegisterVO register) {
        return false;
    }
}
