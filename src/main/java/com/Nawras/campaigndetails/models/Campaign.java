package com.Nawras.campaigndetails.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Campaign {
    private String advertisingId;
    private String country;
    private double price;
    private int eventTypeId;
    private int gdpr;
    private double minCpm;
    private double priority;
    private double bidPrice;

    public Campaign(){}

    public Campaign(String advertisingId, String country, double price, int eventTypeId, int gdpr, double minCpm, double priority, double bidPrice) {
        this.advertisingId = advertisingId;
        this.country = country;
        this.price = price;
        this.eventTypeId = eventTypeId;
        this.gdpr = gdpr;
        this.minCpm = minCpm;
        this.priority = priority;
        this.bidPrice = bidPrice;
    }

    public String getAdvertisingId() {
        return advertisingId;
    }

    public void setAdvertisingId(String advertisingId) {
        this.advertisingId = advertisingId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public int getGdpr() {
        return gdpr;
    }

    public void setGdpr(int gdpr) {
        this.gdpr = gdpr;
    }

    public double getMinCpm() {
        return minCpm;
    }

    public void setMinCpm(double minCpm) {
        this.minCpm = minCpm;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }


}
