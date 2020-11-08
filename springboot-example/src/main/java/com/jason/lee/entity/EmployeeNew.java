package com.jason.lee.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/24
 */
@Data
public class EmployeeNew {

    private Integer id;
    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private Integer departmentId;


    public EmployeeNew() {
    }

    public EmployeeNew(Integer id, String lastName, String email, Integer gender, Integer departmentId) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.departmentId = departmentId;
    }
}
