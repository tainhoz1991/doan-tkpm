package com.doan.accountservice.service.impl;

import com.doan.accountservice.dto.VehicleTypeDTO;
import com.doan.accountservice.entities.VehicleTypeEntity;
import com.doan.accountservice.enums.StatusEnum;
import com.doan.accountservice.mapper.VehicleTypeMapper;
import com.doan.accountservice.repository.VehicleTypeRepository;
import com.doan.accountservice.service.VehicleTypeService;
import com.doan.accountservice.vo.VehicleTypeVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleTypeServiceImpl implements VehicleTypeService {
    private final VehicleTypeRepository vehicleTypeRepository;
    private final VehicleTypeMapper vehicleTypeMapper;

    @Override
    public List<VehicleTypeVO> getAll() {
        return vehicleTypeMapper.toVOs(vehicleTypeRepository.findAll());
    }

    @Override
    public VehicleTypeVO create(VehicleTypeDTO dto) {
        VehicleTypeEntity entity = vehicleTypeMapper.toEntity(dto);
        entity.setStatus(StatusEnum.ACTIVE);
        entity.setCreatedDate(new Date());
        entity.setModifiedDate(new Date());
        return vehicleTypeMapper.toVO(vehicleTypeRepository.save(entity));
    }
}
