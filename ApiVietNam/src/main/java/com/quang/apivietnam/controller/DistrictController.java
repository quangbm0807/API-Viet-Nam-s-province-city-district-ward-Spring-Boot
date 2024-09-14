package com.quang.apivietnam.controller;

import com.quang.apivietnam.dto.response.DistrictResponse;
import com.quang.apivietnam.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/districts")
public class DistrictController {
    @Autowired
    private DistrictService service;

    @GetMapping("/all")
    public List<DistrictResponse> getAll() {
        return service.getAll();
    }
    @GetMapping("/allByUnit")
    public List<DistrictResponse> getAllByUnit(@RequestParam Integer id) {
        return service.findAllByUnitId(id);
    }
    @GetMapping("/allByDistrict")
    public List<DistrictResponse> getAllByUnitAndDistrict(@RequestParam Integer provinceId) {
        return service.findAllByProvinceId( provinceId);
    }

    @GetMapping("/allByDistrictAndUnit")
    public List<DistrictResponse> getAllByUnitAndDistrictAndUnit(@RequestParam Integer provinceId, @RequestParam Integer unitId) {
        return service.findAllByProvinceIdAndUnitId(provinceId, unitId);
    }

}
