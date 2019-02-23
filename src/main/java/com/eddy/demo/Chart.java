package com.eddy.demo;

import java.util.ArrayList;
import java.util.List;

public class Chart {
    List<Integer> dataX = new ArrayList<Integer>();
    List<Integer> dataY = new ArrayList<Integer>();

    public void dataXAddPoint(int point){
        dataX.add(point);
    }

    public void dataYAddPoint(int point){
        dataY.add(point);
    }

    public List<Integer> getDataX() {
        return dataX;
    }

    public void setDataX(List<Integer> dataX) {
        this.dataX = dataX;
    }

    public List<Integer> getDataY() {
        return dataY;
    }

    public void setDataY(List<Integer> dataY) {
        this.dataY = dataY;
    }
}
