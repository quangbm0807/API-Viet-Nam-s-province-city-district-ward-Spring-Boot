package com.quang.apivietnam.dto.response;

import com.quang.apivietnam.model.District;
import lombok.Getter;

@Getter
public class DistrictResponse {

    private int id;
    private String name;
    private String nameEn;
    public DistrictResponse(District district) {
        this.id = district.getCode();
        this.name = district.getFullName();
        this.nameEn = district.getFullNameEn();
    }
}
