package com.doan.accountservice.entities;

import com.doan.accountservice.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table(name = "vehicle_types")
@Entity
@Data
public class VehicleTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "name")
    private String name;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "modified_Date")
    private Date modifiedDate;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
}
