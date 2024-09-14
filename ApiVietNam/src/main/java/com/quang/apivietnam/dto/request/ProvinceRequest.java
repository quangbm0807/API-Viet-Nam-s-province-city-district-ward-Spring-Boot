package com.quang.apivietnam.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProvinceRequest {
    private String code;
    private String name;
    private Integer regionId;
    private Integer unitId;
}