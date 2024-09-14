package com.quang.apivietnam.service;

import com.quang.apivietnam.dto.response.ProvinceResponse;
import com.quang.apivietnam.model.Province;
import com.quang.apivietnam.repository.ProvinceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProvinceService {

    @Autowired
    ProvinceRepository repository;

    public List<ProvinceResponse> getAllProvinceResponses() {
        return repository.findAll().stream()
                .map(ProvinceResponse::new)
                .collect(Collectors.toList());
    }

    public ProvinceResponse getProvinceResponseByCode(int code) {
        Province province = repository.findById(code).orElse(null);
        return province != null ? new ProvinceResponse(province) : null;
    }

    public List<ProvinceResponse> findProvincesByUnitId(int unitId) {
        return repository.findProvincesByUnitId(unitId).stream()
                .map(ProvinceResponse::new)
                .collect(Collectors.toList());
    }

    public List<ProvinceResponse> findProvincesByRegionId(int regionId) {
        return repository.findProvincesByRegionId(regionId).stream()
                .map(ProvinceResponse::new)
                .collect(Collectors.toList());
    }

    public List<ProvinceResponse> findProvincesByRegionIdAndUnitId(int regionId, int unitId) {
        return repository.findProvincesByRegionIdAndUnitId(regionId, unitId).stream()
                .map(ProvinceResponse::new)
                .collect(Collectors.toList());
    }
}