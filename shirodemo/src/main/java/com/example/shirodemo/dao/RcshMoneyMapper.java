package com.example.shirodemo.dao;

import com.example.shirodemo.entity.RcshMoney;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RcshMoneyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RcshMoney record);

    RcshMoney selectByPrimaryKey(Integer id);

    List<RcshMoney> selectAll();

    int updateByPrimaryKey(RcshMoney record);
}