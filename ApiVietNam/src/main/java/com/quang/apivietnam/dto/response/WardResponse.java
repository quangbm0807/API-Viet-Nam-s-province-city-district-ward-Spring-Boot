package com.quang.apivietnam.dto.response;

import com.quang.apivietnam.model.Ward;
import lombok.Getter;

@Getter
public class WardResponse {
    private int id;
    private String name;
    private String nameEn;
    public WardResponse(Ward ward) {
        this.id = ward.getCode();
        this.name = ward.getFullName();
        this.nameEn = ward.getFullNameEn();
    }
}
