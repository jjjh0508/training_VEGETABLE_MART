package com.jihwan.mart.dao;

import com.jihwan.mart.dto.MartDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("martDAO")
public class MartDAOImpt implements  MartDAO {
    @Override
    public List<MartDTO> selectProduct(SqlSessionTemplate sqlSession) {
        return sqlSession.selectList("MartMapper.selectProduct");
    }
}
