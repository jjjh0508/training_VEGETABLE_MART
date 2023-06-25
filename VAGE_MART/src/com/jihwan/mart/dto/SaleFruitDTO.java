package com.jihwan.mart.dto;

public class SaleFruitDTO {
    private int proNum;
    private int weigh;

    public SaleFruitDTO() {
    }

    public SaleFruitDTO(int proNum, int weigh) {
        this.proNum = proNum;
        this.weigh = weigh;
    }

    public int getProNum() {
        return proNum;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setProNum(int proNum) {
        this.proNum = proNum;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "SaleFruitDTO{" +
                "proNum=" + proNum +
                ", weigh=" + weigh +
                '}';
    }
}
