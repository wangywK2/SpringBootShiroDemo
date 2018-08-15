package com.example.shirodemo.common.exception.user;

/**
 * @Method 用户密码不正确或不符合规范异常类
 * @PACKAGE_NAME com.example.shirodemo.common.exception.user
 * @Auther player
 * @Date 2018/8/3
 * @Version 1.0
 */
public class UserPasswordNotMatchException extends UserException{
    private static final long serialVersionUID = 1L;
    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}
