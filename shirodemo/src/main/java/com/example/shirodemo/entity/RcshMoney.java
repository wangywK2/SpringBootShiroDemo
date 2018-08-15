package com.example.shirodemo.entity;

import java.util.Date;

public class RcshMoney {
    private Integer id;

    private Double yxf;

    private Date createtime;

    private Date rksj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getYxf() {
        return yxf;
    }

    public void setYxf(Double yxf) {
        this.yxf = yxf;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }
}