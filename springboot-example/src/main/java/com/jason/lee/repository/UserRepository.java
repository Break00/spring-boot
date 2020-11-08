package com.jason.lee.repository;

import com.jason.lee.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/28
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
