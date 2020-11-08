package com.jason.lee.controller;

import com.jason.lee.entity.Person;
import com.jason.lee.exception.UserNotExistException;
import com.jason.lee.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/18
 */
@RestController
public class HelloController {

    @Autowired
    Person person;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    HelloService helloService;

    @ResponseBody
    @GetMapping("/query")
    public Map<String ,Object> query(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user");
        return list.get(0);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/getPerson")
    public String getPerson() {
        return person.toString();
    }

    @GetMapping("/exception")
    public void getException(){
        throw new UserNotExistException();
    }


    @GetMapping("/hi")
    public String hello(){
        return helloService.sayHello("haha");
    }
}
