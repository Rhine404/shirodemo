package com.rhine.blog.service;


import com.rhine.blog.po.UserBean;

public interface UserService {

    UserBean findByName(String name);
}
