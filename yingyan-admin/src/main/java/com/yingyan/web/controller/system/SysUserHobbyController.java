package com.yingyan.web.controller.system;

import com.yingyan.common.response.ResponseResult;
import com.yingyan.system.domin.SysUserHobby;
import com.yingyan.system.service.impl.SysUserHobbyServiceImpl;
import com.yingyan.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SysUserHobbyController extends BaseController {

    @Autowired
    SysUserHobbyServiceImpl sysUserHobbyService;

    @GetMapping("/sysUserHobby")
    public ResponseResult findAll(){
        startPage();
        List<SysUserHobby> data = sysUserHobbyService.findAll();
        return getResult(data);
    }

    @GetMapping("/sysUserHobby/{id}")
    public ResponseResult findById(@PathVariable Long id){
        return getResult(sysUserHobbyService.findById(id));
    }

    @PostMapping("/sysUserHobby")
    public ResponseResult add(@Validated @RequestBody SysUserHobby sysUserHobby){
        return getResult(sysUserHobbyService.add(sysUserHobby));
    }

    @PutMapping("/sysUserHobby")
    public ResponseResult update(@Validated @RequestBody SysUserHobby sysUserHobby){
        return getResult(sysUserHobbyService.update(sysUserHobby));
    }

    @DeleteMapping("/sysUserHobby/{ids}")
    public ResponseResult delete(@PathVariable Long[] ids){
        return getResult(sysUserHobbyService.delete(ids));
    }

}
