package com.yingyan.web.controller.system;

import com.yingyan.common.response.ResponseResult;
import com.yingyan.system.domin.SysActor;
import com.yingyan.system.domin.SysMovie;
import com.yingyan.system.service.impl.SysActorServiceImpl;
import com.yingyan.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SysActorController extends BaseController {
    @Autowired
    private SysActorServiceImpl sysActorService;

    @GetMapping("/sysActor")
    public ResponseResult findAll(SysActor sysActor){
        startPage();
        List<SysActor> data = sysActorService.findAll(sysActor);
        return getResult(data);
    }

    @GetMapping("/sysActor/{id}")
    public ResponseResult findById(@PathVariable Long id){
        return getResult(sysActorService.findById(id));
    }

    @PostMapping("/sysActor")
    public ResponseResult add(@Validated @RequestBody SysActor sysActor){
        return getResult(sysActorService.add(sysActor));
    }

    @PutMapping("/sysActor")
    public ResponseResult update(@Validated @RequestBody SysActor sysActor){
        return getResult(sysActorService.update(sysActor));
    }

    @DeleteMapping("/sysActor/{ids}")
    public ResponseResult delete(@PathVariable Long[] ids){
        return getResult(sysActorService.delete(ids));
    }

    @GetMapping("/sysActor/find/{id}")
    public ResponseResult findActorById(@PathVariable Long id){
        return getResult(sysActorService.findActorById(id));
    }
}
