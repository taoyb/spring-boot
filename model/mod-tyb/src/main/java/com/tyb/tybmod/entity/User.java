package com.tyb.tybmod.entity;

import com.tyb.infra.jpa.BaseEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by taoyb on 2016-12-02.
 */

@Entity
@Table(name = "users", catalog = "simon")
@DynamicInsert
@DynamicUpdate
public class User extends BaseEntity {
    @Column(name = "username")
    private String userName;//用户名
    @Column
    private String phone;//用户手机
    @Column
    private String password;//用户密码

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
