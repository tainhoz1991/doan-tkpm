package com.doan.accountservice.vo;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class VehicleTypeVO {
    private Long id;
    private String type;
    private String name;
}
