package com.yingyan.system.service.impl;

import com.yingyan.system.domin.SysMovieToCategory;
import com.yingyan.system.mapper.SysMovieToCategoryMapper;
import com.yingyan.system.service.SysMovieToCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMovieToCategoryServiceImpl implements SysMovieToCategoryService {

    @Autowired
    private SysMovieToCategoryMapper sysMovieToCategoryMapper;

    @Override
    public List<SysMovieToCategory> findAll(SysMovieToCategory sysMovieToCategory) {
        return sysMovieToCategoryMapper.findAll(sysMovieToCategory);
    }

    @Override
    public int add(SysMovieToCategory sysMovieToCategory) {
        return sysMovieToCategoryMapper.add(sysMovieToCategory);
    }

    @Override
    public int delete(SysMovieToCategory sysMovieToCategory) {
        return sysMovieToCategoryMapper.delete(sysMovieToCategory);
    }
}
