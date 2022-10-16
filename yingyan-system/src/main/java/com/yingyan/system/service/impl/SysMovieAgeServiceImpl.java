package com.yingyan.system.service.impl;

import com.yingyan.system.domin.SysMovieAge;
import com.yingyan.system.mapper.SysMovieAgeMapper;
import com.yingyan.system.service.SysMovieAgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysMovieAgeServiceImpl implements SysMovieAgeService {

    @Autowired
    SysMovieAgeMapper sysMovieAgeMapper;

    @Override
    public List<SysMovieAge> findAll() {
        return sysMovieAgeMapper.findAll();
    }

    @Override
    public SysMovieAge findById(Long id) {
        return sysMovieAgeMapper.findById(id);
    }

    @Override
    public int add(SysMovieAge sysMovieAge) {
        return sysMovieAgeMapper.add(sysMovieAge);
    }

    @Override
    public int update(SysMovieAge sysMovieAge) {
        return sysMovieAgeMapper.update(sysMovieAge);
    }

    @Override
    public int delete(Long[] ids) {
        int rows = 0;
        for(Long id : ids)
            rows += sysMovieAgeMapper.delete(id);
        return rows;
    }
}
