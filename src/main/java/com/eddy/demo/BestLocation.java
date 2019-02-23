package com.eddy.demo;

public class BestLocation {
    double longtitude;
    double langtitude;
    int percent;

    public BestLocation(double longtitude, double langtitude, int percent) {
        this.longtitude =  longtitude;
        this.langtitude =  langtitude;
        this.percent = percent;
    }

    public double  getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(float longtitude) {
        this.longtitude = longtitude;
    }

    public double  getLangtitude() {
        return langtitude;
    }

    public void setLangtitude(float langtitude) {
        this.langtitude = langtitude;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
