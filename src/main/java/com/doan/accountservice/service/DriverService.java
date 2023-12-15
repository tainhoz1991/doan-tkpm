package com.doan.accountservice.service;

import com.doan.accountservice.dto.DriverDTO;
import com.doan.accountservice.vo.DriverVO;

public interface DriverService {
    DriverVO create(DriverDTO dto);
}
