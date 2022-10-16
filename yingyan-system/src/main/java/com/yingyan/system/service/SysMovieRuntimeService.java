package com.yingyan.system.service;

import com.yingyan.system.domin.SysMovieRuntime;
import com.yingyan.system.domin.SysUserHobby;

import java.util.List;


public interface SysMovieRuntimeService {

    List<SysMovieRuntime> findAll();

    SysMovieRuntime findById(Long id);

    int add(SysMovieRuntime sysMovieRuntime);

    int update(SysMovieRuntime sysMovieRuntime);

    int delete(Long[] ids);

}
