package com.example.shirodemo.service.impl;

import com.example.shirodemo.dao.RcshMapper;
import com.example.shirodemo.entity.Rcsh;
import com.example.shirodemo.service.RcshService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.service.impl
 * @Auther player
 * @Date 2018/8/11
 * @Version 1.0
 */
@Service
public class RcshServiceImpl implements RcshService {
    @Resource
    private RcshMapper rcshMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return rcshMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Rcsh record) {
        return rcshMapper.insert(record);
    }

    @Override
    public Rcsh selectByPrimaryKey(Integer id) {
        return rcshMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Rcsh> selectAll() {
        return rcshMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Rcsh record) {
        return rcshMapper.updateByPrimaryKey(record);
    }
}
