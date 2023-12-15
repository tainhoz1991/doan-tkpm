package com.doan.accountservice.entities;

import com.doan.accountservice.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "customers")
@Data
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "picture")
    private String picture;
    @Column(name = "address")
    private String address;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "modified_Date")
    private Date modifiedDate;
}
