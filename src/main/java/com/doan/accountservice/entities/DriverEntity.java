package com.doan.accountservice.entities;

import com.doan.accountservice.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "drivers")
@Data
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "driving_license")
    private String drivingLicense;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "identify_card")
    private String identifyCard;
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Column(name = "picture")
    private String picture;
    @Column(name = "license_plate")
    private String licensePlate;
    @Column(name = "vehicle_name")
    private String vehicleName;
    @Column(name = "vehicle_brand")
    private String vehicleBrand;
    @Column(name = "social_insurance")
    private String socialInsurance;
    @Column(name = "bank_account")
    private String bankAccount;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "modified_Date")
    private Date modifiedDate;
}
