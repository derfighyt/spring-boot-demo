package com.liuli.springboot.demo.service.impl;

import com.liuli.springboot.demo.dao.entity.User;
import com.liuli.springboot.demo.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * Created by li.liu on 2017/9/14.
 */

@Service
public class UserService implements BaseService<User> {
    @Override
    public void test() {
        System.out.println("this is user service");
    }
}
