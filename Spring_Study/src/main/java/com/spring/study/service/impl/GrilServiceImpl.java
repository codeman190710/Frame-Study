package com.spring.study.service.impl;

import com.spring.study.dao.GrilDao;
import com.spring.study.domain.Gril;
import com.spring.study.service.GrilService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Haotian
 * @Date: 2019/11/30 20:03
 * @Description: 用户操作方法实现
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class GrilServiceImpl implements GrilService {
    private final GrilDao grilDao;

    public GrilServiceImpl(GrilDao grilDao) {
        this.grilDao = grilDao;
    }

    @Override
    public void add(Gril gril) {
        grilDao.add( gril );
    }

    @Override
    public void update(Gril gril) {
        grilDao.update( gril );
    }

    @Override
    public List<Gril> findAll() {
        return grilDao.findAll();
    }

    @Override
    public void delete(Integer id) {
        grilDao.delete( id );
    }

    @Override
    public Gril findByTd(Integer id) {
        return grilDao.findById( id );
    }
}
