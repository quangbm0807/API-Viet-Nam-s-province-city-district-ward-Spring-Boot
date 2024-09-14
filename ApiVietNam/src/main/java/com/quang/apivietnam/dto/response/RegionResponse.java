package com.quang.apivietnam.dto.response;


import com.quang.apivietnam.model.AdministrativeRegion;
import lombok.Getter;

@Getter
public class RegionResponse {
    private int id;
    private String name;
    private String nameEn;
    public RegionResponse(AdministrativeRegion administrativeRegion) {
        this.id = administrativeRegion.getId();
        this.name = administrativeRegion.getName();
        this.nameEn = administrativeRegion.getNameEn();
    }
}
