package com.jihwan.mart.service;

import com.jihwan.mart.dao.MartDAO;
import com.jihwan.mart.dto.*;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("martService")
public class MartServiceImpl implements  MartService {
    private final MartDAO martDAO;
    private final SqlSessionTemplate sqlSession;
    @Autowired
    public MartServiceImpl(MartDAO martDAO, SqlSessionTemplate sqlSession) {
        this.martDAO = martDAO;
        this.sqlSession = sqlSession;
    }

    @Override
    public List<FruitDTO> selectFruitProduct() {
       return martDAO.selectFruitProduct(sqlSession);
    }

    @Override
    public List<VegetableDTO> selectVegetableProduct() {
        return martDAO.selectVegetableProduct(sqlSession);
    }

    @Override
    public List<OrderDTO> selectOrder() {
        return martDAO.selectOrder(sqlSession);
    }

    @Override
    public boolean orderSale(SaleFruitDTO saleFruitDTO) {
        int result = martDAO.orderSale(sqlSession,saleFruitDTO);
        if(result >=1){
            return  true;
        }else{
            return false;
        }

    }


    @Override
    public boolean payment(PayDTO payDTO) {
        int result = martDAO.payment(sqlSession,payDTO);
        if(result >=1){
            return  true;
        }else{
            return false;
        }

    }

    @Override
    public boolean calculate() {
        int result = martDAO.calculate(sqlSession);
        if(result>=1){
            return  true;
        }else{
            return false;
        }

    }
}
