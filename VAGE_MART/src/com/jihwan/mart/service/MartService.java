package com.jihwan.mart.service;

import com.jihwan.mart.dto.*;

import java.util.List;

public interface MartService {
    public List<FruitDTO> selectFruitProduct();
    public List<VegetableDTO> selectVegetableProduct();
    public boolean payment(PayDTO payDTO);
    public List<OrderDTO> selectOrder();
    public boolean orderSale(SaleFruitDTO saleFruitDTO);

    public boolean  calculate();

    public boolean orderClear();




}
