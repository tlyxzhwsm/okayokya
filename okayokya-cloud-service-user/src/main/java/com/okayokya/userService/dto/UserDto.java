package com.okayokya.userService.dto;

import java.sql.Date;

/***
 * @ClassName: UserDto
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/11/28 21:52
 * @version : V1.0
 */
public class UserDto {
    private String id;
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

    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
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
