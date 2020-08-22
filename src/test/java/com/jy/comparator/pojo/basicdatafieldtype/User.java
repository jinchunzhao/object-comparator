package com.jy.comparator.pojo.basicdatafieldtype;

import java.math.BigDecimal;

/**
 * The test object
 *
 * @author JinChunZhao
 * @version 1.0
 * @date 2020-08-22 10:49
 */
public class User {

    private Long id;

    private String userName;

    private Integer age;

    private Double money;

    private Boolean isDisabled;

    private BigDecimal money1;

    private Float money2;

    private Byte status;

    private Character gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean disabled) {
        isDisabled = disabled;
    }

    public BigDecimal getMoney1() {
        return money1;
    }

    public void setMoney1(BigDecimal money1) {
        this.money1 = money1;
    }

    public Float getMoney2() {
        return money2;
    }

    public void setMoney2(Float money2) {
        this.money2 = money2;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public User(Long id, String userName, Integer age, Double money, Boolean isDisabled, BigDecimal money1, Float money2,
        Byte status, Character gender) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.money = money;
        this.isDisabled = isDisabled;
        this.money1 = money1;
        this.money2 = money2;
        this.status = status;
        this.gender = gender;
    }

    public User() {
    }
}
