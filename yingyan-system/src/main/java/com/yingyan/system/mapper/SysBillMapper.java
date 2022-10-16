package com.yingyan.system.mapper;

import com.yingyan.system.domin.SysBill;

import java.util.List;


public interface SysBillMapper {

    List<SysBill> findAll(SysBill sysBill);

    SysBill findById(Long id);

    int add(SysBill sysBill);

    int update(SysBill sysBill);

    int delete(Long id);

    Double todayBoxOffice();
    
}
