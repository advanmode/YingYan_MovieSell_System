package com.yingyan.system.service;

import com.yingyan.system.domin.SysMovieAge;
import com.yingyan.system.domin.SysMovieArea;

import java.util.List;


public interface SysMovieAreaService {
    List<SysMovieArea> findAll();

    SysMovieArea findById(Long id);

    int add(SysMovieArea sysMovieArea);

    int update(SysMovieArea sysMovieArea);

    int delete(Long[] ids);
}
