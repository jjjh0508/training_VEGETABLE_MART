package com.jihwan.mart.dao;

import com.jihwan.mart.dto.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("martDAO")
public class MartDAOImpt implements  MartDAO {
    @Override
    public List<FruitDTO> selectFruitProduct(SqlSessionTemplate sqlSession) {
        return sqlSession.selectList("MartMapper.selectFruitProduct");
    }


    @Override
    public List<VegetableDTO> selectVegetableProduct(SqlSessionTemplate sqlSession) {
        return sqlSession.selectList("MartMapper.selectVegetableProduct");
    }

    @Override
    public int orderSale(SqlSessionTemplate sqlSession, SaleFruitDTO saleFruitDTO) {
        return sqlSession.insert("MartMapper.orderSale", saleFruitDTO);

    }

    @Override
    public int payment(SqlSessionTemplate sqlSession, PayDTO payDTO) {
        return sqlSession.insert("MartMapper.payment", payDTO);
    }


    @Override
    public List<OrderDTO> selectOrder(SqlSessionTemplate sqlSession) {
        return sqlSession.selectList("MartMapper.selectOrder");
    }

    @Override
    public int calculate(SqlSessionTemplate sqlSession) {
        return sqlSession.insert("MartMapper.calculate");
    }


    @Override
    public int orderClear(SqlSessionTemplate sqlSession) {
        return sqlSession.update("MartMapper.orderClear");
    }
}
