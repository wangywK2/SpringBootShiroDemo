package com.example.shirodemo.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @Method
 * @PACKAGE_NAME com.wyw.weixun.Entity
 * @Auther player
 * @Date 2018/6/20
 * @Version 1.0
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer userid;

    private String jobnumber;

    private String username;

    private String realname;

    private String password;

    @JSONField(format="yyyy-MM-dd")
    private Date birthday;

    private Integer age;

    @JSONField(format="yyyy-MM-dd")
    private Date entrytime;

    private String address;

    private String phone;

    private String nation;

    private String email;

    private String identity;

    @JSONField(format="yyyy-MM-dd")
    private Date dimissiomtime;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    private Integer createuserid;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date modifytime;

    private Integer modifyuserid;

    private Integer usertype;

    private Integer salary;

    private String salt="weixun";
    //时间字符串
    private String birthdayStr;
    private String entrytimeStr;
    private String dimissiomtimeStr;
    private String createtimeStr;
    private String modifytimeStr;

    private String birthdayStrStart;
    private String entrytimeStrStart;
    private String dimissiomtimeStrStart;
    private String createtimeStrStart;
    private String modifytimeStrStart;

    private String birthdayStrEnd;
    private String entrytimeStrEnd;
    private String dimissiomtimeStrEnd;
    private String createtimeStrEnd;
    private String modifytimeStrEnd;

    public String getSalt() {
        return salt;
    }

    public String getBirthdayStr() {
        return birthdayStr;
    }

    public void setBirthdayStr(String birthdayStr) {
        this.birthdayStr = birthdayStr;
    }

    public String getEntrytimeStr() {
        return entrytimeStr;
    }

    public void setEntrytimeStr(String entrytimeStr) {
        this.entrytimeStr = entrytimeStr;
    }

    public String getDimissiomtimeStr() {
        return dimissiomtimeStr;
    }

    public void setDimissiomtimeStr(String dimissiomtimeStr) {
        this.dimissiomtimeStr = dimissiomtimeStr;
    }

    public String getCreatetimeStr() {
        return createtimeStr;
    }

    public void setCreatetimeStr(String createtimeStr) {
        this.createtimeStr = createtimeStr;
    }

    public String getModifytimeStr() {
        return modifytimeStr;
    }

    public void setModifytimeStr(String modifytimeStr) {
        this.modifytimeStr = modifytimeStr;
    }

    public String getBirthdayStrStart() {
        return birthdayStrStart;
    }

    public void setBirthdayStrStart(String birthdayStrStart) {
        this.birthdayStrStart = birthdayStrStart;
    }

    public String getEntrytimeStrStart() {
        return entrytimeStrStart;
    }

    public void setEntrytimeStrStart(String entrytimeStrStart) {
        this.entrytimeStrStart = entrytimeStrStart;
    }

    public String getDimissiomtimeStrStart() {
        return dimissiomtimeStrStart;
    }

    public void setDimissiomtimeStrStart(String dimissiomtimeStrStart) {
        this.dimissiomtimeStrStart = dimissiomtimeStrStart;
    }

    public String getCreatetimeStrStart() {
        return createtimeStrStart;
    }

    public void setCreatetimeStrStart(String createtimeStrStart) {
        this.createtimeStrStart = createtimeStrStart;
    }

    public String getModifytimeStrStart() {
        return modifytimeStrStart;
    }

    public void setModifytimeStrStart(String modifytimeStrStart) {
        this.modifytimeStrStart = modifytimeStrStart;
    }

    public String getBirthdayStrEnd() {
        return birthdayStrEnd;
    }

    public void setBirthdayStrEnd(String birthdayStrEnd) {
        this.birthdayStrEnd = birthdayStrEnd;
    }

    public String getEntrytimeStrEnd() {
        return entrytimeStrEnd;
    }

    public void setEntrytimeStrEnd(String entrytimeStrEnd) {
        this.entrytimeStrEnd = entrytimeStrEnd;
    }

    public String getDimissiomtimeStrEnd() {
        return dimissiomtimeStrEnd;
    }

    public void setDimissiomtimeStrEnd(String dimissiomtimeStrEnd) {
        this.dimissiomtimeStrEnd = dimissiomtimeStrEnd;
    }

    public String getCreatetimeStrEnd() {
        return createtimeStrEnd;
    }

    public void setCreatetimeStrEnd(String createtimeStrEnd) {
        this.createtimeStrEnd = createtimeStrEnd;
    }

    public String getModifytimeStrEnd() {
        return modifytimeStrEnd;
    }

    public void setModifytimeStrEnd(String modifytimeStrEnd) {
        this.modifytimeStrEnd = modifytimeStrEnd;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Date getDimissiomtime() {
        return dimissiomtime;
    }

    public void setDimissiomtime(Date dimissiomtime) {
        this.dimissiomtime = dimissiomtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getModifyuserid() {
        return modifyuserid;
    }

    public void setModifyuserid(Integer modifyuserid) {
        this.modifyuserid = modifyuserid;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", jobnumber='" + jobnumber + '\'' +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", entrytime=" + entrytime +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", nation='" + nation + '\'' +
                ", email='" + email + '\'' +
                ", identity='" + identity + '\'' +
                ", dimissiomtime=" + dimissiomtime +
                ", createtime=" + createtime +
                ", createuserid=" + createuserid +
                ", modifytime=" + modifytime +
                ", modifyuserid=" + modifyuserid +
                ", usertype=" + usertype +
                ", salary=" + salary +
                ", birthdayStr='" + birthdayStr + '\'' +
                ", entrytimeStr='" + entrytimeStr + '\'' +
                ", dimissiomtimeStr='" + dimissiomtimeStr + '\'' +
                ", createtimeStr='" + createtimeStr + '\'' +
                ", modifytimeStr='" + modifytimeStr + '\'' +
                ", birthdayStrStart='" + birthdayStrStart + '\'' +
                ", entrytimeStrStart='" + entrytimeStrStart + '\'' +
                ", dimissiomtimeStrStart='" + dimissiomtimeStrStart + '\'' +
                ", createtimeStrStart='" + createtimeStrStart + '\'' +
                ", modifytimeStrStart='" + modifytimeStrStart + '\'' +
                ", birthdayStrEnd='" + birthdayStrEnd + '\'' +
                ", entrytimeStrEnd='" + entrytimeStrEnd + '\'' +
                ", dimissiomtimeStrEnd='" + dimissiomtimeStrEnd + '\'' +
                ", createtimeStrEnd='" + createtimeStrEnd + '\'' +
                ", modifytimeStrEnd='" + modifytimeStrEnd + '\'' +
                '}';
    }
}
