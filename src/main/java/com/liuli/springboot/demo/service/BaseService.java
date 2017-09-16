package com.liuli.springboot.demo.service;

import java.io.Serializable;

/**
 * 测试spring4 泛型依赖注入
 */
public interface BaseService <M extends Serializable> {

    public void test();
}
