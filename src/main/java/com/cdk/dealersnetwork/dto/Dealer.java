package com.cdk.dealersnetwork.dto;
import java.util.Date;

/**
 * Created by sharmach on 30/8/2016.
 */

public class Dealer {
    private int dealerId;
    private String name;
    private long phone;
    private Date regDate;
    private String email;
    private String password;
    public Dealer() {
    }

    public Dealer(int dealerId, String name, long phone, Date regDate, String email, String password) {
        this.dealerId = dealerId;
        this.name = name;
        this.phone = phone;
        this.regDate = regDate;
        this.email = email;
        this.password = password;
    }

    public Dealer(String name, long phone, Date regDate, String email, String password) {
        this.name = name;
        this.phone = phone;
        this.regDate = regDate;
        this.email = email;
        this.password = password;
    }

    public Dealer(int dealerId){
        this.dealerId = dealerId;
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

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dealer dealer = (Dealer) o;

        if (dealerId != dealer.dealerId) return false;
        if (phone != dealer.phone) return false;
        if (!name.equals(dealer.name)) return false;
        if (!regDate.equals(dealer.regDate)) return false;
        if (!email.equals(dealer.email)) return false;
        return password.equals(dealer.password);

    }

    @Override
    public int hashCode() {
        int result = dealerId;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        result = 31 * result + regDate.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "dealerId=" + dealerId +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", regDate=" + regDate +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}