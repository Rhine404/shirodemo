package com.rhine.blog.service.impl;

import com.rhine.blog.mapper.UserMapper;
import com.rhine.blog.po.UserBean;
import com.rhine.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean findByName(String name) {
        // 查询用户是否存在
        UserBean bean = userMapper.findByName(name);
        if (bean != null) {
            // 查询用户信息、角色、权限
            bean = userMapper.findById(bean.getId());
        }
        return bean;
    }
}