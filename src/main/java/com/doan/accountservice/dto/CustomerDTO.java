package com.doan.accountservice.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private String mobilePhone;
    private String password;
    private String fullName;
    private String picture;
    private String address;
}
