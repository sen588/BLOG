package com.bgamq.admin.mapper;

import com.bgamq.admin.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<User> {

    List<User> findAll();

}
