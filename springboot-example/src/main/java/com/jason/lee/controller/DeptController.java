package com.jason.lee.controller;

import com.jason.lee.entity.DepartmentNew;
import com.jason.lee.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/28
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DepartmentMapper deptMapper;

    @GetMapping("/{id}")
    public DepartmentNew getDeptById(@PathVariable("id") Integer id){
        return deptMapper.getDeptById(id);
    }
}
