package com.bgamq.admin.service.impl;

import com.bgamq.admin.service.AdminService;
import com.bgamq.core.bean.PageVo;
import com.bgamq.core.bean.QueryCondition;
import com.bgamq.core.entity.TAdmin;
import com.bgamq.core.entity.TAdminExample;
import com.bgamq.core.mapper.TAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private TAdminMapper adminMapper;

    @Override
    public PageVo queryPage(QueryCondition queryCondition) {
        return null;
    }

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
