package com.quang.apivietnam.dto.response;


import com.quang.apivietnam.model.AdministrativeRegion;

public class RegionResponse {
    private int id;
    private String name;
    private String nameEn;
    public RegionResponse(AdministrativeRegion administrativeRegion) {
        this.name = administrativeRegion.getName();
        this.nameEn = administrativeRegion.getNameEn();
        this.id = administrativeRegion.getId();
    }
}
