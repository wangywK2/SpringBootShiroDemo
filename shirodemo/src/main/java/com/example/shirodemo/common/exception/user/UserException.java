package com.example.shirodemo.common.exception.user;

import com.example.shirodemo.common.exception.BaseException;

/**
 * 用户信息异常类
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.common.exception.user
 * @Auther player
 * @Date 2018/8/3
 * @Version 1.0
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;
    public UserException(String code,Object[] agres){
        super("user",code,agres,null);
    }

}
