package com.yingyan.system.service;

import com.yingyan.system.domin.SysMovie;
import com.yingyan.system.domin.SysMovieToCategory;

import java.util.List;


public interface SysMovieToCategoryService {

    List<SysMovieToCategory> findAll(SysMovieToCategory sysMovieToCategory);

    int add(SysMovieToCategory sysMovieToCategory);

    int delete(SysMovieToCategory sysMovieToCategory);

}
