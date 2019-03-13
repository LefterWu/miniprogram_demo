package com.wuleshen.miniprogram.demo.web;

import com.wuleshen.miniprogram.demo.common.CommonResponse;
import com.wuleshen.miniprogram.demo.entity.Area;
import com.wuleshen.miniprogram.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wuleshen on 2019/3/10
 */
@RestController
@RequestMapping("/admin")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/list/area")
    public CommonResponse listAll() {
        List<Area> areaList = areaService.findAll();
        return CommonResponse.createSuccessData(areaList);
    }

    @GetMapping("/list/area/{id}")
    public CommonResponse listAreaById(@PathVariable("id") Integer id) {
        Area area = areaService.findAreaById(id);
        return CommonResponse.createSuccessData(area);
    }

    @PostMapping("/area")
    public CommonResponse addArea(@RequestBody Area area) {
        return CommonResponse.createSuccessData(areaService.addArea(area));
    }

    @DeleteMapping("/area/{id}")
    public CommonResponse deleteAreaById(@PathVariable("id") Integer id) {
        return CommonResponse.createSuccessData(areaService.deleteArea(id));
    }

    @PutMapping("/area")
    public CommonResponse modifyArea(@RequestBody Area area) {
        return CommonResponse.createSuccessData(areaService.modifyArea(area));
    }
}
