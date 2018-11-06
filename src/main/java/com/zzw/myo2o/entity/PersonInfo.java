package com.zzw.myo2o.entity;

import java.util.Date;

/**
 * author: zzw5005
 * date: 2018/10/24 10:58
 */

/*
* 个人信息
* */
public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private String gender;
    //0 代表被禁止使用本商城 1代表允许使用本商城
    private Integer enableStatue;

    //1代表客户 2代表店家 3代表超级管理员
    private Integer userType;
    private Date createTime;
    private Date lastTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatue() {
        return enableStatue;
    }

    public void setEnableStatue(Integer enableStatue) {
        this.enableStatue = enableStatue;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}
