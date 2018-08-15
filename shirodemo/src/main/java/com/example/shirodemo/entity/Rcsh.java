package com.example.shirodemo.entity;

import java.util.Date;

public class Rcsh {
    private Integer id;

    private String sm;

    private Double monery;

    private Date xfsj;

    private String founder;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public Double getMonery() {
        return monery;
    }

    public void setMonery(Double monery) {
        this.monery = monery;
    }

    public Date getXfsj() {
        return xfsj;
    }

    public void setXfsj(Date xfsj) {
        this.xfsj = xfsj;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}