package com.okayokya.orderService.model;

import java.io.Serializable;
import java.sql.Date;

/***
 * @ClassName: User
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/11/25 18:38
 * @version : V1.0
 */
public class User implements Serializable {

    private String id;
    private Date updateDate;
    private int deleted;
    private String account;
    private String password;
    private String mobile;
    private Date regDate;
    private String regType;
    private String email;
    private String nickname;
    private String iconPath;
    private int status;
    private String activeKey;
    private String age;
    private int gender ;
    private float points;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getActiveKey() {
        return activeKey;
    }

    public void setActiveKey(String activeKey) {
        this.activeKey = activeKey;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public User(String id, Date updateDate, int deleted, String account, String password, String mobile, Date regDate, String regType, String email, String nickname, String iconPath, int status, String activeKey, String age, int gender, float points) {
        this.id = id;
        this.updateDate = updateDate;
        this.deleted = deleted;
        this.account = account;
        this.password = password;
        this.mobile = mobile;
        this.regDate = regDate;
        this.regType = regType;
        this.email = email;
        this.nickname = nickname;
        this.iconPath = iconPath;
        this.status = status;
        this.activeKey = activeKey;
        this.age = age;
        this.gender = gender;
        this.points = points;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", updateDate=" + updateDate +
                ", deleted=" + deleted +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", regDate=" + regDate +
                ", regType='" + regType + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", iconPath='" + iconPath + '\'' +
                ", status=" + status +
                ", activeKey='" + activeKey + '\'' +
                ", age='" + age + '\'' +
                ", gender=" + gender +
                ", points=" + points +
                '}';
    }
}
