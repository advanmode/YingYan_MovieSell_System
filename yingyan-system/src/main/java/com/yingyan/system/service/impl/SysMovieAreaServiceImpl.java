package com.yingyan.system.service.impl;

import com.yingyan.system.domin.SysMovieArea;
import com.yingyan.system.mapper.SysMovieAreaMapper;
import com.yingyan.system.service.SysMovieAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysMovieAreaServiceImpl implements SysMovieAreaService {
    @Autowired
    SysMovieAreaMapper sysMovieAreaMapper;

    @Override
    public List<SysMovieArea> findAll() {
        return sysMovieAreaMapper.findAll();
    }

    @Override
    public SysMovieArea findById(Long id) {
        return sysMovieAreaMapper.findById(id);
    }

    @Override
    public int add(SysMovieArea sysMovieArea) {
        return sysMovieAreaMapper.add(sysMovieArea);
    }

    @Override
    public int update(SysMovieArea sysMovieArea) {
        return sysMovieAreaMapper.update(sysMovieArea);
    }

    @Override
    public int delete(Long[] ids) {
        int rows = 0;
        for (Long id : ids) {
            rows += sysMovieAreaMapper.delete(id);
        }
        return rows;
    }
}
