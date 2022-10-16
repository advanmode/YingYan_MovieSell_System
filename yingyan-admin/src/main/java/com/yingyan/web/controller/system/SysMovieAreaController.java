package com.yingyan.web.controller.system;

import com.yingyan.common.response.ResponseResult;
import com.yingyan.system.domin.SysMovieAge;
import com.yingyan.system.domin.SysMovieArea;
import com.yingyan.system.service.SysMovieAreaService;
import com.yingyan.system.service.impl.SysMovieAgeServiceImpl;
import com.yingyan.system.service.impl.SysMovieAreaServiceImpl;
import com.yingyan.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SysMovieAreaController extends BaseController {
    @Autowired
    SysMovieAreaServiceImpl sysMovieAreaService;

    @GetMapping("/sysMovieArea")
    public ResponseResult findAll(){
        startPage();
        List<SysMovieArea> data = sysMovieAreaService.findAll();
        return getResult(data);
    }

    @GetMapping("/sysMovieArea/{id}")
    public ResponseResult findById(@PathVariable Long id){
        return getResult(sysMovieAreaService.findById(id));
    }

    @PostMapping("/sysMovieArea")
    public ResponseResult add(@Validated @RequestBody SysMovieArea sysMovieArea){
        return getResult(sysMovieAreaService.add(sysMovieArea));
    }


    @PutMapping("/sysMovieArea")
    public ResponseResult update(@Validated @RequestBody SysMovieArea sysMovieArea){
        return getResult(sysMovieAreaService.update(sysMovieArea));
    }

    @DeleteMapping("/sysMovieArea/{ids}")
    public ResponseResult delete(@PathVariable Long[] ids){
        return getResult(sysMovieAreaService.delete(ids));
    }
}
