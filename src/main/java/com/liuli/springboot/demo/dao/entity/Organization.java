package com.liuli.springboot.demo.dao.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Organization 实体类
 */
@Data
public class Organization implements Serializable {

    private String id;
    private String name;
}
