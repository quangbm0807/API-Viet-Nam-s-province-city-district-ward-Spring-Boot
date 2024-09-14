package com.quang.apivietnam.repository;

import com.quang.apivietnam.model.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WardRepository extends JpaRepository<Ward, Integer> {

    @Query(value = "SELECT * FROM wards WHERE district_code = ?1", nativeQuery = true)
    public List<Ward> findAllByDistrictId(Integer districtId);
    @Query(value = "SELECT * FROM wards WHERE district_code = ?1 AND administrative_unit_id = ?2", nativeQuery = true)
    public List<Ward> findAllByDistrictIdAndRegionId(Integer districtId, Integer regionId);

    @Query(value = "SELECT * FROM wards WHERE administrative_unit_id = ?1", nativeQuery = true)
    public List<Ward> findAllByRegionId(Integer unitId);



}
