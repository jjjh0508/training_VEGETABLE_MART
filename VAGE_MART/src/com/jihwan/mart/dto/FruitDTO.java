package com.jihwan.mart.dto;

public class FruitDTO {
    private int proNum;
    private int fruitNum;
    private String fruitName;
    private String amount;


    public FruitDTO() {
    }

    public FruitDTO(int proNum, int fruitNum, String fruitName, String amount) {
        this.proNum = proNum;
        this.fruitNum = fruitNum;
        this.fruitName = fruitName;
        this.amount = amount;
    }

    public int getProNum() {
        return proNum;
    }

    public int getFruitNum() {
        return fruitNum;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getAmount() {
        return amount;
    }

    public void setProNum(int proNum) {
        this.proNum = proNum;
    }

    public void setFruitNum(int fruitNum) {
        this.fruitNum = fruitNum;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "FruitDTO{" +
                "proNum=" + proNum +
                ", fruitNum=" + fruitNum +
                ", fruitName='" + fruitName + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
