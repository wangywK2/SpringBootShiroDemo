package com.example.shirodemo.service;

import com.example.shirodemo.entity.Rcsh;

import java.util.List;

/**
 * 日常生活费记录
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.service
 * @Auther player
 * @Date 2018/8/11
 * @Version 1.0
 */
public interface RcshService {
    int deleteByPrimaryKey(Integer id);

    int insert(Rcsh record);

    Rcsh selectByPrimaryKey(Integer id);

    List<Rcsh> selectAll();

    int updateByPrimaryKey(Rcsh record);

}
