package com.quang.apivietnam.dto.response;


import com.quang.apivietnam.model.Province;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProvinceResponse {
    private Integer id;
    private String name;
    private Integer regionId;
    private Integer unitId;
}
