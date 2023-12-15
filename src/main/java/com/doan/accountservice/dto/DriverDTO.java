package com.doan.accountservice.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class DriverDTO {
    private String mobilePhone;
    private String password;
    private String fullName;
    private String drivingLicense;
    private String identifyCard;
    private String vehicleType;
    private String picture;
    private String licensePlate;
    private String vehicleName;
    private String vehicleBrand;
    private String socialInsurance;
    private String bankAccount;
    private String bankName;
}
