package com.jihwan.mart.dto;

public class MartDTO {
    private int proNum;
    private int fruitNum;
    private String amount;


    public MartDTO(int proNum, int fruitNum, String amount) {
        this.proNum = proNum;
        this.fruitNum = fruitNum;
        this.amount = amount;
    }

    public void setProNum(int proNum) {
        this.proNum = proNum;
    }

    public void setFruitNum(int fruitNum) {
        this.fruitNum = fruitNum;
    }

    public void setAmount(String amount) {
        this.amount = amount;

    }

    @Override
    public String toString() {
        return "MartDTO{" +
                "proNum=" + proNum +
                ", fruitNum=" + fruitNum +
                ", amount='" + amount + '\'' +
                '}';
    }
}
