package com.yingyan.system.service;

import com.yingyan.system.domin.SysMovieAge;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SysMovieAgeService {

    List<SysMovieAge> findAll();

    SysMovieAge findById(Long id);

    int add(SysMovieAge sysMovieAge);

    int update(SysMovieAge sysMovieAge);

    int delete(Long[] ids);

}
