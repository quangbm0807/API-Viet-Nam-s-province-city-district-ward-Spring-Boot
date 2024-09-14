package com.quang.apivietnam.repository;

import com.quang.apivietnam.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProvinceRepository extends JpaRepository<Province, Integer> {
    @Query(value = "SELECT * FROM provinces WHERE administrative_region_id = ?1", nativeQuery = true)
    List<Province> findProvincesByRegionId(Integer regionId);

    @Query(value = "SELECT * FROM provinces WHERE administrative_unit_id = ?1", nativeQuery = true)
    List<Province> findProvincesByUnitId(Integer regionId);

    @Query(value = "SELECT * FROM provinces WHERE administrative_region_id = ?1 AND administrative_unit_id = ?2", nativeQuery = true)
    List<Province> findProvincesByUnitId(Integer regionId, Integer unitId);
}
