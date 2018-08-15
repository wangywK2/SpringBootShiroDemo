package com.example.shirodemo.service;

import com.example.shirodemo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.service
 * @Auther player
 * @Date 2018/7/24
 * @Version 1.0
 */
@Service
public interface UserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    User selectByPrimaryKey(Integer userid);

    User selectUserByUserName(String userName);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    List<User> selectUserByParam(User user);

    List<Map<String, String>> everyMonthUserCount();
}
