package com.bgamq.admin.service.impl;

import com.bgamq.admin.entity.User;
import com.bgamq.admin.mapper.UserMapper;
import com.bgamq.admin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/6/2316:34
 */
@Service("userService")
public class UserServiceImpl  implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findList() {
        return userMapper.findAll();
    }
}
