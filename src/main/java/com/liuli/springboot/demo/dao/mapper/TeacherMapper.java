package com.liuli.springboot.demo.dao.mapper;

import com.liuli.springboot.demo.dao.entity.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Teacher Mapper
 *
 * @author li.liu
 */
public interface TeacherMapper {

    @Select("select * from Teacher where name = #{name}")
    public List<Teacher> likeName(String name);

    @Select("select * from Teacher where id = #{id}")
    public Teacher getById(long id);

    @Select("select name from Teacher where id = #{id}")
    public String getNameById(long id);
}
