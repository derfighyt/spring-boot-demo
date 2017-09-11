package com.liuli.springboot.demo.dao.mapper;

import com.liuli.springboot.demo.dao.entity.Classes;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;


/**
 * Class mapper
 *
 * @author li.liu
 */
public interface ClassMapper {

    @Select("select * from class c, teacher t where c.c_id=#{id}")
    @Results(value = {
            @Result(id = true, property = "id", column = "c_id", javaType = Long.class, jdbcType = JdbcType.INTEGER),
            @Result(property = "name", column = "c_name", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    public List<Classes> getClassById(long id);

    @Select("select * from class c, teacher t where c.c_id=#{id} and c.teacher_id = t.t_id")
    @ResultMap(value = "com.liuli.springboot.demo.dao.mapper.ClassMapper.classResultMap")
    public List<Classes> getClassWithTeacherById(long id);

}
