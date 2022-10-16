package com.yingyan.system.service.impl;

import com.yingyan.system.domin.SysResource;
import com.yingyan.system.mapper.SysResourceMapper;
import com.yingyan.system.service.SysResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class SysResourceServiceImpl implements SysResourceService {

    @Autowired
    private SysResourceMapper sysResourceMapper;

    @Override
    public List<SysResource> findAll() {
        return sysResourceMapper.findAll();
    }

    @Override
    public List<SysResource> findWithChildren() {
        return sysResourceMapper.findWithChildren();
    }

    @Override
    public List<SysResource> findAllWithAllChildren() {
        return sysResourceMapper.findAllWithAllChildren();
    }

    @Override
    public SysResource findById(Long id) {
        return sysResourceMapper.findById(id);
    }

    @Override
    public int add(SysResource sysResource) {
        if(sysResource.getParentId() == 0){
            sysResource.setLevel(1);
        }else{
            SysResource parent = this.findById(sysResource.getParentId());
            if(parent != null){
                sysResource.setLevel(parent.getLevel() + 1);
            }
        }
        return sysResourceMapper.add(sysResource);
    }

    @Override
    public int update(SysResource sysResource) {
        if(sysResource.getParentId() == 0){
            sysResource.setLevel(1);
        }else{
            SysResource parent = this.findById(sysResource.getParentId());
            if(parent != null){
                sysResource.setLevel(parent.getLevel() + 1);
            }
        }
        log.debug(sysResource.toString());
        return sysResourceMapper.update(sysResource);
    }

    @Override
    public int delete(Long[] ids) {
        int rows = 0;
        for(Long id : ids){
            rows += sysResourceMapper.delete(id);
        }
        return rows;
    }
}
