package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class User {
    private Long id;                     // BIGINT，主键
    private String username;             // VARCHAR，用户名
    private Integer age;                 // INT，年龄
    private Boolean active;              // TINYINT，是否激活
    private Double height;               // DOUBLE，身高
    private BigDecimal balance;          // DECIMAL，余额
    private LocalDateTime createTime;    // DATETIME，创建时间
    private String description;          // TEXT，描述
    private byte[] avatar;               // BLOB，头像
    private Character gender;            // CHAR，性别（M/F）

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
}