package com.jihwan.mart.dao;

import com.jihwan.mart.dto.MartDTO;
import org.mybatis.spring.SqlSessionTemplate;

public interface MartDAO {
    public MartDTO selectProduct(SqlSessionTemplate sqlSession);
}
