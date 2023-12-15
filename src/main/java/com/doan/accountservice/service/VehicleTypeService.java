package com.doan.accountservice.service;

import com.doan.accountservice.dto.VehicleTypeDTO;
import com.doan.accountservice.vo.VehicleTypeVO;

import java.util.List;

public interface VehicleTypeService {
    List<VehicleTypeVO> getAll();

    VehicleTypeVO create(VehicleTypeDTO dto);
}
