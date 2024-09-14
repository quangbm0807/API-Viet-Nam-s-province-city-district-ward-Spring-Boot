package com.quang.apivietnam.controller;

import com.quang.apivietnam.dto.response.ProvinceResponse;
import com.quang.apivietnam.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    ProvinceService service;

    @GetMapping("/all")
    public List<ProvinceResponse> getAll() {
        return service.getAllProvinceResponses();
    }

    @GetMapping("/")
    public ProvinceResponse getByCode(@RequestParam int code) {
        return service.getProvinceResponseByCode(code);
    }

    @GetMapping("/region")
    public List<ProvinceResponse> getByRegion(@RequestParam int regionId) {
        return service.findProvincesByRegionId(regionId);
    }

    @GetMapping("/unit")
    public List<ProvinceResponse> getByUnit(@RequestParam int unitId) {
        return service.findProvincesByUnitId(unitId);
    }

    @GetMapping("/region&unit")
    public List<ProvinceResponse> getByUnit(@RequestParam int regionId, @RequestParam int unitId) {
        return service.findProvincesByRegionIdAndUnitId(regionId, unitId);
    }

}