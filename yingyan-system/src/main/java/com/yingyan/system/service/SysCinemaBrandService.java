package com.yingyan.system.service;

import com.yingyan.system.domin.SysCinemaBrand;

import java.util.List;

public interface SysCinemaBrandService {
    List<SysCinemaBrand> findAll();

    SysCinemaBrand findById(Long id);

    int add(SysCinemaBrand sysCinemaBrand);

    int update(SysCinemaBrand sysCinemaBrand);

    int delete(Long[] ids);
}
