package com.jihwan.mart.dto;

public class PayDTO {
    private int price;

    public PayDTO() {
    }

    public PayDTO(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "PayDTO{" +
                "price=" + price +
                '}';
    }
}
