package com.quang.apivietnam.controller;

import com.quang.apivietnam.dto.response.UnitResponse;
import com.quang.apivietnam.service.AdministrativeUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/units")
public class AdministrativeUnitController {
    @Autowired
    private AdministrativeUnitService service;

    @GetMapping("/all")
    public List<UnitResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/id")
    public UnitResponse getID(@RequestParam int id) {
        return service.findByID(id);
    }


}
