package com.yingyan.system.mapper;

import com.yingyan.system.domin.SysCinema;
import com.yingyan.system.domin.vo.SysCinemaVo;

import java.util.List;


public interface SysCinemaMapper {

    List<SysCinema> findAll(SysCinemaVo sysCinemaVo);

    SysCinema findById(Long id);

    int add(SysCinema sysCinema);

    int update(SysCinema sysCinema);

    int delete(Long id);

    //前台展示单个影院信息，返回包含影院、上映中的所有电影信息
    SysCinema findCinemaById(Long id);

}
