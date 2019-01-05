package com.pyg.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pyg.service.UserService;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "hello";
    }
}
