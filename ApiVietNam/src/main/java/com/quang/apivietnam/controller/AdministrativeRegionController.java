package com.quang.apivietnam.controller;


import com.quang.apivietnam.dto.response.RegionResponse;
import com.quang.apivietnam.service.AdministrativeRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/region")
public class AdministrativeRegionController {
    @Autowired
    AdministrativeRegionService service;
    @GetMapping("/all")
    public List<RegionResponse> getAll() {
        return service.getAll();
    }
    @GetMapping("/id")
    public RegionResponse getID(@RequestParam int id) {
        return service.findByID(id);
    }
}
