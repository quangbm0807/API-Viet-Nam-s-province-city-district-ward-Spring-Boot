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

    @GetMapping("/{code}")
    public ProvinceResponse getByCode(@PathVariable String code) {
        return service.getProvinceResponseByCode(code);
    }
}