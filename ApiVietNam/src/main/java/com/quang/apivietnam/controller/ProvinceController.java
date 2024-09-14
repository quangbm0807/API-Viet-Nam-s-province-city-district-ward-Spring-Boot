package com.quang.apivietnam.controller;

import com.quang.apivietnam.dto.request.ProvinceRequest;
import com.quang.apivietnam.model.Province;
import com.quang.apivietnam.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    ProvinceService service;

    @GetMapping("/all")
    public List<Province> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public void createProvince(@RequestBody ProvinceRequest request) {
        service.createProvince(request.getName(), request.getRegionId(), request.getUnitId());
    }

    @PutMapping("/update")
    public void updateProvince(@RequestBody ProvinceRequest request) {
        service.updateProvince(request.getName(), request.getId());
    }

    @DeleteMapping("/delete")
    public void deleteProvince(@PathVariable Integer id) {
        service.deleteProvince(id);
    }
}
