package com.yingyan.system.mapper;

import com.yingyan.system.domin.SysActorMovie;

import java.util.List;


public interface SysActorMovieMapper {
    List<SysActorMovie> findAll(SysActorMovie sysActorMovie);

    int add(SysActorMovie sysActorMovie);

    int delete(SysActorMovie sysActorMovie);
}
