package com.eddy.demo;

import java.io.Serializable;

public class Shop implements Serializable {

    String shopName;
    double Lattitude;
    double Longtitude;

    public Shop(String shopName, double lattitude, double longtitude) {
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

    public double  getLattitude() {
        return Lattitude;
    }

    public void setLattitude(float lattitude) {
        Lattitude = lattitude;
    }

    public double  getLongtitude() {
        return Longtitude;
    }

    public void setLongtitude(float longtitude) {
        Longtitude = longtitude;
    }
}
