package com.yingyan.web.controller.system;

import com.yingyan.common.response.ResponseResult;
import com.yingyan.system.domin.SysCinemaArea;
import com.yingyan.system.service.impl.SysCinemaAreaServiceImpl;
import com.yingyan.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SysCinemaAreaController extends BaseController {

    @Autowired
    private SysCinemaAreaServiceImpl sysCinemaAreaService;

    @GetMapping("/sysCinemaArea")
    public ResponseResult findAll(){
        startPage();
        List<SysCinemaArea> data = sysCinemaAreaService.findAll();
        return getResult(data);
    }

    @GetMapping("/sysCinemaArea/{id}")
    public ResponseResult findById(@PathVariable Long id){
        return getResult(sysCinemaAreaService.findById(id));
    }

    @PostMapping("/sysCinemaArea")
    public ResponseResult add(@Validated @RequestBody SysCinemaArea sysCinemaArea){
        return getResult(sysCinemaAreaService.add(sysCinemaArea));
    }

    @PutMapping("/sysCinemaArea")
    public ResponseResult update(@Validated @RequestBody SysCinemaArea sysCinemaArea){
        return getResult(sysCinemaAreaService.update(sysCinemaArea));
    }

    @DeleteMapping("/sysCinemaArea/{ids}")
    public ResponseResult delete(@PathVariable Long[] ids){
        return getResult(sysCinemaAreaService.delete(ids));
    }

}
