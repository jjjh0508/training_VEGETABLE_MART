package com.jihwan.mart.dao;

import com.jihwan.mart.dto.MartDTO;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public interface MartDAO {
    public List<MartDTO> selectProduct(SqlSessionTemplate sqlSession);
}
