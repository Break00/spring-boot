package com.jason.lee.exception;

/**
 * @author 19047589 Jason Lee
 * @description 自定义异常
 * @date 2020/9/25
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }
}
