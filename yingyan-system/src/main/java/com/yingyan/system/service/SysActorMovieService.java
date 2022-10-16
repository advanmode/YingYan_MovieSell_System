package com.yingyan.system.service;

import com.yingyan.system.domin.SysActor;
import com.yingyan.system.domin.SysActorMovie;

import java.util.List;


public interface SysActorMovieService {
    List<SysActorMovie> findAll(SysActorMovie sysActorMovie);

    int add(SysActorMovie sysActorMovie);

    int delete(SysActorMovie sysActorMovie);
}
