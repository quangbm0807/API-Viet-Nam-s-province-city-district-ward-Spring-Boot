package com.quang.apivietnam.controller;


import com.quang.apivietnam.dto.response.WardResponse;
import com.quang.apivietnam.service.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ward")
public class WardController {

    @Autowired
    private WardService service;

    @GetMapping("/all")
    public List<WardResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/id")
    public WardResponse getID(@RequestParam int id) {
        return service.findByID(id);
    }

    @GetMapping("/allByUnit")
    public List<WardResponse> getAllByRegion(@RequestParam Integer id) {
        return service.findAllByRegiontId(id);
    }

    @GetMapping("/allByDistrict")
    public List<WardResponse> getAllByDistrict(@RequestParam Integer id) {
        return service.findAllByDistrictId(id);
    }

    @GetMapping("/allByDistrictAndUnit")
    public List<WardResponse> getAllByDistrictAndRegion(@RequestParam Integer districtId, @RequestParam Integer regionId) {
        return service.findAllByDistrictIdAndRegionId(districtId, regionId);
    }
}
