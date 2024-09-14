package com.quang.apivietnam.repository;

import com.quang.apivietnam.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District, Integer> {
    @Query(value = "SELECT * FROM districts WHERE province_code = ?1", nativeQuery = true)
    public List<District> findAllByProvinceId(Integer provinceId);

    @Query(value = "SELECT * FROM districts WHERE province_code = ?1 AND administrative_unit_id = ?2", nativeQuery = true)
    public List<District> findAllByProvinceIdAndUnitId(Integer provinceId, Integer unitId);

    @Query(value = "SELECT * FROM districts WHERE administrative_unit_id = ?1", nativeQuery = true)
    public List<District> findAllByUnitId(Integer unitId);

    @Query(value = "SELECT * FROM districts WHERE administrative_region_id = ?1", nativeQuery = true)
    public List<District> findAllByRegionId(Integer regionId);
}
