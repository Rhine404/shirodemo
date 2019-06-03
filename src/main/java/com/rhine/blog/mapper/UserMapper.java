package com.rhine.blog.mapper;

import com.rhine.blog.po.UserBean;

public interface UserMapper {

    UserBean findByName(String name);

    UserBean findById(String id);
}