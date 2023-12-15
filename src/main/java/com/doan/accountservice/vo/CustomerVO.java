package com.doan.accountservice.vo;

import lombok.Data;

@Data
public class CustomerVO {
    private Long id;
    private String fullName;
    private String picture;
    private String address;
}
