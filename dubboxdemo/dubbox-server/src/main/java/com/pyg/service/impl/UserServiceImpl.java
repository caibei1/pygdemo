package com.pyg.service.impl;

import com.pyg.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "hello";
    }
}
