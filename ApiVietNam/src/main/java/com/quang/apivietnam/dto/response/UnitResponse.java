package com.quang.apivietnam.dto.response;

import com.quang.apivietnam.model.AdministrativeUnit;
import lombok.Getter;

@Getter
public class UnitResponse {

    private int id;
    private String name;
    private String nameEn;
    public UnitResponse(AdministrativeUnit administrativeUnit) {
        this.id = administrativeUnit.getId();
        this.name = administrativeUnit.getFullName();
        this.nameEn = administrativeUnit.getFullNameEn();
    }
}
