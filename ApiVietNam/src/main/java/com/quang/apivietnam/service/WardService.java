package com.quang.apivietnam.service;

import com.quang.apivietnam.dto.response.WardResponse;
import com.quang.apivietnam.repository.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WardService {
    @Autowired
    WardRepository repository;

    public List<WardResponse> getAll() {
        return repository.findAll().stream().map(WardResponse::new).collect(Collectors.toList());
    }

    public WardResponse findByID(Integer id) {
        return repository.findById(id).map(WardResponse::new).orElse(null);
    }

    public List<WardResponse> findAllByDistrictId(Integer code) {
        return repository.findAllByDistrictId(code).stream().map(WardResponse::new).collect(Collectors.toList());
    }

    public List<WardResponse> findAllByRegiontId(Integer code) {
        return repository.findAllByRegionId(code).stream().map(WardResponse::new).collect(Collectors.toList());
    }

    public List<WardResponse> findAllByDistrictIdAndRegionId(Integer districtId, Integer unitId) {
        return repository.findAllByDistrictIdAndRegionId(districtId, unitId).stream().map(WardResponse::new).collect(Collectors.toList());
    }
}
