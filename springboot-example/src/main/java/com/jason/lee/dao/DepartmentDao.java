package com.jason.lee.dao;

import com.jason.lee.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/24
 */

@Repository
public class DepartmentDao {

    private static Map<Integer, Department> departments;

    static {
        departments = new HashMap<>();
        departments.put(101, new Department(101, "D-AA"));
        departments.put(102, new Department(102, "D-BB"));
        departments.put(103, new Department(103, "D-CC"));
        departments.put(104, new Department(104, "D-DD"));
        departments.put(105, new Department(105, "D-EE"));
    }

    public Collection<Department> getDepartments() {
        return departments.values();
    }

    public Department getDepartment(Integer id) {
        return departments.get(id);
    }

}