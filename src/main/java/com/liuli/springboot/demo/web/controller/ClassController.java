package com.liuli.springboot.demo.web.controller;

import com.liuli.springboot.demo.dao.entity.Classes;
import com.liuli.springboot.demo.dao.entity.Teacher;
import com.liuli.springboot.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Class Controller
 *
 * @author li.liu
 */
@RestController
@RequestMapping("/demo")
public class ClassController {

    @Autowired
    private ClassService classService;

    @RequestMapping("/likeName")
    public List<Teacher> likeName(String name) {
        return classService.likeName(name);
    }

    @RequestMapping("/getClass")
    public List<Classes> getClass(long id) {
        return classService.getClassById(id);
    }

    @RequestMapping("/getClassWithTeacher")
    public List<Classes> getClassWithTeacher(long id) {
        return classService.getClassWithTeacherById(id);
    }
}
