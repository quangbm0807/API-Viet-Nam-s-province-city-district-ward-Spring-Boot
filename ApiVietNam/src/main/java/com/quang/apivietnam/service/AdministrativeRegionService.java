package com.quang.apivietnam.service;

import com.quang.apivietnam.dto.response.RegionResponse;
import com.quang.apivietnam.repository.AdministrativeRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class AdministrativeRegionService {
    @Autowired
    AdministrativeRegionRepository repository;
    public List<RegionResponse> getAll() {
        return repository.findAll().stream().map(RegionResponse::new).collect(Collectors.toList());
    }
    public RegionResponse findByID(Integer id) {
        return repository.findById(id).map(RegionResponse::new).orElse(null);
    }
}
