package com.jason.lee.mapper;

import com.jason.lee.entity.DepartmentNew;
import org.apache.ibatis.annotations.Select;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/28
 */
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    DepartmentNew getDeptById(Integer id);
}
