package com.jihwan.mart.dao;

import com.jihwan.mart.dto.MartDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("martDAO")
public class MartDAOImpt implements  MartDAO {
    @Override
    public MartDTO selectProduct(SqlSessionTemplate sqlSession) {
        return sqlSession.selectOne("MartMapper.selectProduct");
    }
}
