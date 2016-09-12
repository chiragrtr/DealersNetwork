package com.cdk.dealersnetwork.dto;

import java.util.Date;

/**
 * Created by sharmach on 30/8/2016.
 */
public class Bid {
    private int bidId;
    private int broadcastId;
    private int dealerId;
    private Date bidDate;
    private float price;
    private int deliveryHours;
    private int status;
    private int notified;

    public Bid() {
    }

    public Bid(int bidId, int broadcastId, int dealerId, Date bidDate, float price, int deliveryHours, int status, int notified) {
        this.bidId = bidId;
        this.broadcastId = broadcastId;
        this.dealerId = dealerId;
        this.bidDate = bidDate;
        this.price = price;
        this.deliveryHours = deliveryHours;
        this.status = status;
        this.notified = notified;
    }

    public Bid(int broadcastId, int dealerId, Date bidDate, float price, int deliveryHours, int status, int notified) {
        this.broadcastId = broadcastId;
        this.dealerId = dealerId;
        this.bidDate = bidDate;
        this.price = price;
        this.deliveryHours = deliveryHours;
        this.status = status;
        this.notified = notified;
    }

    public int getBidId() {
        return bidId;
    }

    public void setBidId(int bidId) {
        this.bidId = bidId;
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

    public Date getBidDate() {
        return bidDate;
    }

    public void setBidDate(Date bidDate) {
        this.bidDate = bidDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDeliveryHours() {
        return deliveryHours;
    }

    public void setDeliveryHours(int deliveryHours) {
        this.deliveryHours = deliveryHours;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNotified() {
        return notified;
    }

    public void setNotified(int notified) {
        this.notified = notified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bid bid = (Bid) o;

        if (bidId != bid.bidId) return false;
        if (broadcastId != bid.broadcastId) return false;
        if (dealerId != bid.dealerId) return false;
        if (Float.compare(bid.price, price) != 0) return false;
        if (deliveryHours != bid.deliveryHours) return false;
        if (status != bid.status) return false;
        if (notified != bid.notified) return false;
        return bidDate.equals(bid.bidDate);

    }

    @Override
    public int hashCode() {
        int result = bidId;
        result = 31 * result + broadcastId;
        result = 31 * result + dealerId;
        result = 31 * result + bidDate.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + deliveryHours;
        result = 31 * result + status;
        result = 31 * result + notified;
        return result;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "bidId=" + bidId +
                ", broadcastId=" + broadcastId +
                ", dealerId=" + dealerId +
                ", bidDate=" + bidDate +
                ", price=" + price +
                ", deliveryHours=" + deliveryHours +
                ", status=" + status +
                ", notified=" + notified +
                '}';
    }
}