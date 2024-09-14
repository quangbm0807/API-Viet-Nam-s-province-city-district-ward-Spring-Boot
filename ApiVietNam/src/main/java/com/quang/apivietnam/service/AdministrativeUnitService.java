package com.quang.apivietnam.service;


import com.quang.apivietnam.dto.response.UnitResponse;
import com.quang.apivietnam.model.AdministrativeUnit;
import com.quang.apivietnam.repository.AdministrativeUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdministrativeUnitService {
    @Autowired
    AdministrativeUnitRepository repository;

    public List<UnitResponse> getAll() {
        return repository.findAll().stream().map(UnitResponse::new).collect(Collectors.toList());
    }

    public  UnitResponse findByID(Integer id) {
        return repository.findById(id).map(UnitResponse::new).orElse(null);
    }

}
