package com.example.shirodemo.dao;

import com.example.shirodemo.entity.Rcsh;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RcshMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rcsh record);

    Rcsh selectByPrimaryKey(Integer id);

    List<Rcsh> selectAll();

    int updateByPrimaryKey(Rcsh record);
}