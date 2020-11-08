package com.jason.lee.entity;

import lombok.Data;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/24
 */
@Data
public class Department {

    private Integer id;
    private String departmentName;

    public Department(Integer id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public Department(){}
}
