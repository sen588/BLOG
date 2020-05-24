package com.bgamq.admin.service.impl;

import com.bgamq.admin.mapper.TAdminMapper;
import com.bgamq.core.entity.TAdmin;
import com.bgamq.core.entity.TAdminExample;
import com.bgamq.admin.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Resource
    private TAdminMapper adminMapper;

    @Override
    public TAdmin getById(Long id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(TAdmin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public void updateById(TAdmin admin) {
        adminMapper.updateByPrimaryKey(admin);
    }

    @Override
    public void removeByIds(List<Long> asList) {
        TAdminExample adminExample = new TAdminExample();
        adminMapper.deleteByExample(adminExample);
    }
}
