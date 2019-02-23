package com.eddy.demo;

import java.io.Serializable;

public class Shop implements Serializable {

    String shopName;
    float Lattitude;
    float Longtitude;

    public Shop(String shopName, float lattitude, float longtitude) {
        this.shopName = shopName;
        Lattitude = lattitude;
        Longtitude = longtitude;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public float getLattitude() {
        return Lattitude;
    }

    public void setLattitude(float lattitude) {
        Lattitude = lattitude;
    }

    public float getLongtitude() {
        return Longtitude;
    }

    public void setLongtitude(float longtitude) {
        Longtitude = longtitude;
    }
}
