package com.liuli.springboot.demo.service;

import com.liuli.springboot.demo.dao.entity.Classes;
import com.liuli.springboot.demo.dao.entity.Teacher;

import java.util.List;

/**
 *
 */
public interface ClassService {
    List<Teacher> likeName(String name);

    List<Classes> getClassById(long id);

    List<Classes> getClassWithTeacherById(long id);
}
