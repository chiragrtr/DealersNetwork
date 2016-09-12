package com.cdk.dealersnetwork.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by sharmach on 30/8/2016.
 */

public class Broadcast {
    private int broadcastId;
    private int dealerId;
    private String make;
    private String model;
    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Broadcast broadcast = (Broadcast) o;

        if (broadcastId != broadcast.broadcastId) return false;
        if (dealerId != broadcast.dealerId) return false;
        if (status != broadcast.status) return false;
        if (!make.equals(broadcast.make)) return false;
        if (!model.equals(broadcast.model)) return false;
        if (!color.equals(broadcast.color)) return false;
        return broadcastDate.equals(broadcast.broadcastDate);

    }

    @Override
    public int hashCode() {
        int result = broadcastId;
        result = 31 * result + dealerId;
        result = 31 * result + make.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + broadcastDate.hashCode();
        result = 31 * result + status;
        return result;
    }

    @Override
    public String toString() {
        return "Broadcast{" +
                "broadcastId=" + broadcastId +
                ", dealerId=" + dealerId +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", broadcastDate=" + broadcastDate +
                ", status=" + status +
                '}';
    }

    private Date broadcastDate;
    private int status;

    public Broadcast() {
    }

    public Broadcast(int dealerId, String make, String model, String color, Date broadcastDate, int status) {
        this.dealerId = dealerId;
        this.make = make;
        this.model = model;
        this.color = color;
        this.broadcastDate = broadcastDate;
        this.status = status;
    }

    public Broadcast(int broadcastId, int dealerId, String make, String model, String color, Date broadcastDate, int status) {
        this.broadcastId = broadcastId;
        this.dealerId = dealerId;
        this.make = make;
        this.model = model;
        this.color = color;
        this.broadcastDate = broadcastDate;
        this.status = status;
    }

    public int getBroadcastId() {
        return broadcastId;
    }

    public void setBroadcastId(int broadcastId) {
        this.broadcastId = broadcastId;
    }

    public int getDealerId() {
        return dealerId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getBroadcastDate() {
        return broadcastDate;
    }

    public void setBroadcastDate(Date broadcastDate) {
        this.broadcastDate = broadcastDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
