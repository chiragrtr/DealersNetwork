package com.cdk.dealersnetwork.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by sharmach on 30/8/2016.
 */
@Entity
@Table(name = "dealer")
public class Dealer {
    @Id
    @GeneratedValue
    @Column(name = "d_id")
    private int dealerId;
    @Column
    private String name;
    @Column
    private long phone;
    @Column(name = "reg_date")
    private Timestamp regDate;
    @Column
    private String email;
    @Column
    private String password;

    public Dealer() {
    }

    public Dealer(String name, long phone, Timestamp regDate, String email, String password) {
        this.name = name;
        this.phone = phone;
        this.regDate = regDate;
        this.email = email;
        this.password = password;
    }

    public int getDealerId() {
        return dealerId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
