package com.jihwan.mart.dto;

public class VegetableDTO {
    private int proNum;
    private int vegNum;
    private String vegName;

    private String amount;

    public VegetableDTO() {
    }

    public VegetableDTO(int proNum, int vegNum, String vegName, String amount) {
        this.proNum = proNum;
        this.vegNum = vegNum;
        this.vegName = vegName;
        this.amount = amount;
    }

    public int getProNum() {
        return proNum;
    }

    public int getVegNum() {
        return vegNum;
    }

    public String getVegName() {
        return vegName;
    }

    public String getAmount() {
        return amount;
    }

    public void setProNum(int proNum) {
        this.proNum = proNum;
    }

    public void setVegNum(int vegNum) {
        this.vegNum = vegNum;
    }

    public void setVegName(String vegName) {
        this.vegName = vegName;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "vegetableDTO{" +
                "proNum=" + proNum +
                ", vegNum=" + vegNum +
                ", vegName='" + vegName + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
