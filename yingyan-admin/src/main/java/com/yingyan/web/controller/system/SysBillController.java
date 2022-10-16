package com.yingyan.web.controller.system;

import com.yingyan.common.exception.DataNotFoundException;
import com.yingyan.common.response.ResponseResult;
import com.yingyan.system.domin.SysBill;
import com.yingyan.system.domin.SysMovie;
import com.yingyan.system.domin.SysSession;
import com.yingyan.system.domin.vo.SysBillVo;
import com.yingyan.system.service.impl.SysBillServiceImpl;
import com.yingyan.system.service.impl.SysMovieServiceImpl;
import com.yingyan.system.service.impl.SysSessionServiceImpl;
import com.yingyan.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SysBillController extends BaseController {
    
    @Autowired
    private SysBillServiceImpl sysBillService;

    @Autowired
    private SysSessionServiceImpl sysSessionService;

    @Autowired
    private SysMovieServiceImpl sysMovieService;

    @GetMapping("/sysBill")
    public ResponseResult findAll(SysBill sysBill){
        startPage();
        List<SysBill> data = sysBillService.findAll(sysBill);
        return getResult(data);
    }

    @GetMapping("/sysBill/{id}")
    public ResponseResult findById(@PathVariable Long id){
        return getResult(sysBillService.findById(id));
    }

    @PostMapping("/sysBill")
    public ResponseResult add(@Validated @RequestBody SysBill sysBill){
        System.out.println(sysBill);
        Object obj = sysBillService.add(sysBill);
        if(obj instanceof Integer){
            return getResult((Integer) obj);
        }
        return getResult(obj);
    }

    @PutMapping("/sysBill")
    public ResponseResult update(@RequestBody SysBillVo sysBillVo){
        int rows = sysBillService.update(sysBillVo.getSysBill());
        if(rows > 0 && sysBillVo.getSysBill().getBillState()){
            //更新场次的座位状态
            SysSession curSession = sysSessionService.findOne(sysBillVo.getSysBill().getSessionId());
            if(curSession == null){
                throw new DataNotFoundException("添加订单的场次没找到");
            }
            curSession.setSessionSeats(sysBillVo.getSessionSeats());
            sysSessionService.update(curSession);

            //更新电影票房
            SysMovie curMovie = sysMovieService.findOne(curSession.getMovieId());
            if(curMovie == null){
                throw new DataNotFoundException("添加订单的电影没找到");
            }
            int seatNum = sysBillVo.getSysBill().getSeats().split(",").length;//订单的座位数
            double price = curSession.getSessionPrice();
            curMovie.setMovieBoxOffice(curMovie.getMovieBoxOffice() + seatNum * price);
            sysMovieService.update(curMovie);

        }
        return getResult(rows);
    }

    @DeleteMapping("/sysBill/{ids}")
    public ResponseResult delete(@PathVariable Long[] ids){
        return getResult(sysBillService.delete(ids));
    }

    @GetMapping("todayBoxOffice")
    public ResponseResult todayBoxOffice(){
        return getResult(sysBillService.todayBoxOffice());
    }
    
}
