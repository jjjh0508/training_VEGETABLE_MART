package com.jihwan.mart.dto;

public class OrderDTO {
    private int ordNum;
    private int proNum;

    private int weigh;


    public OrderDTO() {

    }

    public OrderDTO(int ordNum, int proNum, int weigh) {
        this.ordNum = ordNum;
        this.proNum = proNum;
        this.weigh = weigh;
    }

    public int getOrdNum() {
        return ordNum;
    }

    public int getProNum() {
        return proNum;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setOrdNum(int ordNum) {
        this.ordNum = ordNum;
    }

    public void setProNum(int proNum) {
        this.proNum = proNum;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "ordNum=" + ordNum +
                ", proNum=" + proNum +
                ", weigh=" + weigh +
                '}';
    }
}
