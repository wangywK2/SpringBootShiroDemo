package com.example.shirodemo.service.impl;

import com.example.shirodemo.dao.UserMapper;
import com.example.shirodemo.entity.User;
import com.example.shirodemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.service.impl
 * @Auther player
 * @Date 2018/8/2
 * @Version 1.0
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public User selectUserByUserName(String userName) {
        try {
            return userMapper.selectUserByUsername(userName);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("userMapper.selectUserByUsername("+userName+")获取用户信息异常：{}",e.getMessage());
            return null;
        }
    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public List<User> selectUserByParam(User user) {
        return null;
    }

    @Override
    public List<Map<String, String>> everyMonthUserCount() {
        return null;
    }
}
