package com.doan.accountservice.controller;

import com.doan.accountservice.dto.CustomerDTO;
import com.doan.accountservice.dto.DriverDTO;
import com.doan.accountservice.service.CustomerService;
import com.doan.accountservice.service.DriverService;
import com.doan.accountservice.vo.CustomerVO;
import com.doan.accountservice.vo.DriverVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final CustomerService customerService;
    private final DriverService driverService;

    @PostMapping("/driver")
    public DriverVO create(@RequestBody DriverDTO dto){
        return driverService.create(dto);
    }

    @PostMapping("/customer")
    public CustomerVO create(@RequestBody CustomerDTO dto){
        return customerService.create(dto);
    }
}
