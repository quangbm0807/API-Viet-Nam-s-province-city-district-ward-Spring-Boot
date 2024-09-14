package com.quang.apivietnam.service;

import com.quang.apivietnam.dto.response.DistrictResponse;
import com.quang.apivietnam.model.District;
import com.quang.apivietnam.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DistrictService {
    @Autowired
    DistrictRepository repository;

    public List<DistrictResponse> getAll() {
        return repository.findAll().stream().map(DistrictResponse::new).collect(Collectors.toList());
    }
    public DistrictResponse findByID(Integer id) {
        return repository.findById(id).map(DistrictResponse::new).orElse(null);
    }

    public List<DistrictResponse> findAllByProvinceId(Integer code) {
        return repository.findAllByProvinceId(code).stream().map(DistrictResponse::new).collect(Collectors.toList());
    }

    public List<DistrictResponse> findAllByUnitId(Integer code) {
        return repository.findAllByUnitId(code).stream().map(DistrictResponse::new).collect(Collectors.toList());
    }

    public List<DistrictResponse> findAllByProvinceIdAndUnitId(Integer provinceId, Integer unitId) {
        return repository.findAllByProvinceIdAndUnitId(provinceId, unitId).stream().map(DistrictResponse::new).collect(Collectors.toList());
    }
}
