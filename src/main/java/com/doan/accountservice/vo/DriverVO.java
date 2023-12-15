package com.doan.accountservice.vo;

import lombok.Data;

@Data
public class DriverVO {
    private Long id;
    private String vehicleType;
    private String fullName;
    private String picture;
    private String licensePlate;
    private String vehicleName;
    private String vehicleBrand;

}
