package com.liuli.springboot.demo.service.impl;

import com.liuli.springboot.demo.dao.entity.Organization;
import com.liuli.springboot.demo.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * Created by li.liu on 2017/9/14.
 */

@Service
public class OrganizationService implements BaseService<Organization> {
    @Override
    public void test() {
        System.out.println("this is Organization service");
    }
}
