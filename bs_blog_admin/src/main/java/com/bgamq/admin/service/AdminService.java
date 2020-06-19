package com.bgamq.admin.service;



import com.bgamq.core.entity.TAdmin;

import java.util.List;

public interface AdminService {
    TAdmin getById(Long id);

    void save(TAdmin admin);

    void updateById(TAdmin admin);

    void removeByIds(List<Long> asList);
}
