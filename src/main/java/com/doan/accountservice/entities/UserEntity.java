package com.doan.accountservice.entities;

import com.doan.accountservice.enums.StatusEnum;
import com.doan.accountservice.enums.UserTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "mobile_phone")
    private String mobilePhone;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private UserTypeEnum type;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "modified_Date")
    private Date modifiedDate;
}
