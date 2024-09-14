package com.quang.apivietnam.dto.response;

import com.quang.apivietnam.model.Province;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProvinceResponse {
    private String code;
    private String name;
    private String nameEn;
    private String administrativeRegionName;
    private String administrativeUnitFullName;

    public ProvinceResponse(Province province) {
        this.code = province.getCode();
        this.name = province.getName();
        this.nameEn = province.getNameEn();
        this.administrativeRegionName = province.getAdministrativeRegion().getName();
        this.administrativeUnitFullName = province.getAdministrativeUnit().getFullName();
    }
}