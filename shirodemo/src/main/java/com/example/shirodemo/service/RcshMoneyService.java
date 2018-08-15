package com.example.shirodemo.service;

import com.example.shirodemo.entity.RcshMoney;

import java.util.List;

/**
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.service
 * @Auther player
 * @Date 2018/8/11
 * @Version 1.0
 */
public interface RcshMoneyService {
    int deleteByPrimaryKey(Integer id);

    int insert(RcshMoney record);

    RcshMoney selectByPrimaryKey(Integer id);

    List<RcshMoney> selectAll();

    int updateByPrimaryKey(RcshMoney record);
}
