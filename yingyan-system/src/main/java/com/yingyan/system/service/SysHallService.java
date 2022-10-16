package com.yingyan.system.service;

import com.yingyan.system.domin.SysHall;

import java.util.List;


public interface SysHallService {
    List<SysHall> findAll(SysHall sysHall);

    SysHall findByCinemaIdAndHallId(SysHall sysHall);

    int add(SysHall sysHall);

    int update(SysHall sysHall);

    int delete(SysHall[] sysHall);
}
