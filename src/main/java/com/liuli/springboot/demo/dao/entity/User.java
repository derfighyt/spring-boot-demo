package com.liuli.springboot.demo.dao.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * user实体类
 */
@Data
public class User implements Serializable {

    private String id;
    private String name;
}
