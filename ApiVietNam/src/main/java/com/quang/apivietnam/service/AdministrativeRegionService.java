package com.quang.apivietnam.service;

import com.quang.apivietnam.model.AdministrativeRegion;
import com.quang.apivietnam.repository.AdministrativeRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdministrativeRegionService {
    @Autowired
    AdministrativeRegionRepository repository;

    public List<AdministrativeRegion> getAll() {
        return repository.findAll();
    }
    public AdministrativeRegion findByID(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
