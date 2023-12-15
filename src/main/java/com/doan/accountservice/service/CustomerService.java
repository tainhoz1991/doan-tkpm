package com.doan.accountservice.service;

import com.doan.accountservice.dto.CustomerDTO;
import com.doan.accountservice.vo.CustomerVO;

public interface CustomerService {
    CustomerVO create(CustomerDTO dto);
}
