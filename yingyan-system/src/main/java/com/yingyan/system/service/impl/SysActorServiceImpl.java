package com.yingyan.system.service.impl;

import com.yingyan.system.domin.SysActor;
import com.yingyan.system.mapper.SysActorMapper;
import com.yingyan.system.service.SysActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class SysActorServiceImpl implements SysActorService {

    @Autowired
    private SysActorMapper sysActorMapper;

    @Override
    public List<SysActor> findAll(SysActor sysActor) {
        return sysActorMapper.findAll(sysActor);
    }

    @Override
    public SysActor findById(Long id) {
        return sysActorMapper.findById(id);
    }

    @Override
    public int add(SysActor sysActor) {
        return sysActorMapper.add(sysActor);
    }

    @Override
    public int update(SysActor sysActor) {
        return sysActorMapper.update(sysActor);
    }

    @Override
    public int delete(Long[] ids) {
        int rows = 0;
        for (Long id : ids) {
            rows += sysActorMapper.delete(id);
        }
        return rows;
    }

    @Override
    public SysActor findActorById(Long id) {
        return sysActorMapper.findActorById(id);
    }
}
