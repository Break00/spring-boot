package com.jason.lee.controller;

import com.jason.lee.entity.User;
import com.jason.lee.repository.UserRepository;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}")
    public User getUerById(@PathVariable("id") Integer id){
        User user = userRepository.getOne(id);
        return user;
    }
}
