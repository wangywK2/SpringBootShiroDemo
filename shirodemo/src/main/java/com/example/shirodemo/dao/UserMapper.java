package com.example.shirodemo.dao;

import com.example.shirodemo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    User selectByPrimaryKey(Integer userid);

    User selectUserByUsername(String username);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    List<User> selectUserByParam(User user);

    List<Map<String, String>> everyMonthUserCount();


    //Page<Map> everyMonthUserCount2();
}