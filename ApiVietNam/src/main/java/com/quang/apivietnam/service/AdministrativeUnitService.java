package com.quang.apivietnam.service;


import com.quang.apivietnam.model.AdministrativeUnit;
import com.quang.apivietnam.repository.AdministrativeUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativeUnitService {
    @Autowired
    AdministrativeUnitRepository repository;

    public List<AdministrativeUnit> getAll() {
        return repository.findAll();
    }

    public  AdministrativeUnit findByID(Integer id) {
        return repository.findById(id).orElse(null);
    }

}
