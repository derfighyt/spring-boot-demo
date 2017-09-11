package com.liuli.springboot.demo.dao.entity;

import lombok.Data;

/**
 * Class实体类
 *
 * @author li.liu
 */
@Data
public class Classes {

    private long id;
    private String name;

    private Teacher teacher;
}
