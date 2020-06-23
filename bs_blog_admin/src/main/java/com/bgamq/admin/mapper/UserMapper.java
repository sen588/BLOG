package com.bgamq.admin.mapper;

import com.bgamq.admin.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/2315:57
 */
public interface UserMapper extends Mapper<User> {

    List<User> findAll();

}
