package com.peng.sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.sharding.entity.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/9/30 21:36
 */
public interface CourseMapper extends BaseMapper<Course> {
    @Select("select * from course where MOD(cid,2)=1")
    List<Course> unsupportSql();
}
