package com.jason.lee.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/18
 */
@Component
// 加载指定配置文件
@PropertySource(value = {"classpath:person.properties"})
// 加载全局配置文件  优先加载application.properties
@ConfigurationProperties(prefix = "person")
public class Person {

    // SpEL表达式从全局配置文件中取值映射
    // @Value("${person.name}")
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
