package com.bgamq.admin.service;

import com.bgamq.core.bean.PageVo;
import com.bgamq.core.bean.QueryCondition;
import com.bgamq.core.entity.TAdmin;

import java.util.List;

public interface AdminService {

    PageVo queryPage(QueryCondition queryCondition);

    TAdmin getById(Long id);

    void save(TAdmin admin);

    void updateById(TAdmin admin);

    void removeByIds(List<Long> asList);
}
