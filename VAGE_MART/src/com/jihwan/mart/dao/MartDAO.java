package com.jihwan.mart.dao;

import com.jihwan.mart.dto.*;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public interface MartDAO {
    public List<FruitDTO> selectFruitProduct(SqlSessionTemplate sqlSession);
    public List<VegetableDTO> selectVegetableProduct(SqlSessionTemplate sqlSession);

    public int orderSale(SqlSessionTemplate sqlSession,SaleFruitDTO saleFruitDTO);

    public int payment(SqlSessionTemplate sqlSession, PayDTO payDTO);

    public  int calculate(SqlSessionTemplate sqlSession);

    public List<OrderDTO> selectOrder(SqlSessionTemplate sqlSession);
}
