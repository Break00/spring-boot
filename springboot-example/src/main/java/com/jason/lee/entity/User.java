package com.jason.lee.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/28
 */
@Data
@Entity
@Table(name="user")  //默认表名为类名(小写)
public class User {

    @Id  //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "lastName")
    private String lastName;

    @Column //默认列名为属性名
    private String email;
}
