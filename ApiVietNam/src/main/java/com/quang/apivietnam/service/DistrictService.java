package com.quang.apivietnam.service;

import com.quang.apivietnam.model.District;
import com.quang.apivietnam.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    DistrictRepository repository;

    public List<District> getAll() {
        return repository.findAll();
    }
    public District findByID(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
