package com.jihwan.mart.service;

import com.jihwan.mart.dao.MartDAO;
import com.jihwan.mart.dto.MartDTO;
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
    public List<MartDTO> selectProduct() {
        return martDAO.selectProduct(sqlSession);
    }
}
