package com.liuli.springboot.demo.service.impl;

import com.liuli.springboot.demo.dao.entity.Classes;
import com.liuli.springboot.demo.dao.entity.Teacher;
import com.liuli.springboot.demo.dao.mapper.ClassMapper;
import com.liuli.springboot.demo.dao.mapper.TeacherMapper;
import com.liuli.springboot.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class Service类
 *
 * @author li.liu
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<Teacher> likeName(String name) {
        return teacherMapper.likeName(name);
    }

    @Override
    public List<Classes> getClassById(long id) {
        return classMapper.getClassById(id);
    }

    @Override
    public List<Classes> getClassWithTeacherById(long id) {
        return classMapper.getClassWithTeacherById(id);
    }
}
