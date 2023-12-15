package com.doan.accountservice.service.impl;

import com.doan.accountservice.dto.DriverDTO;
import com.doan.accountservice.entities.DriverEntity;
import com.doan.accountservice.entities.UserEntity;
import com.doan.accountservice.entities.VehicleTypeEntity;
import com.doan.accountservice.enums.StatusEnum;
import com.doan.accountservice.enums.UserTypeEnum;
import com.doan.accountservice.mapper.DriverMapper;
import com.doan.accountservice.repository.DriverRepository;
import com.doan.accountservice.repository.UserRepository;
import com.doan.accountservice.repository.VehicleTypeRepository;
import com.doan.accountservice.service.DriverService;
import com.doan.accountservice.utils.HashUtils;
import com.doan.accountservice.vo.DriverVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;
    private final DriverMapper driverMapper;
    private final UserRepository userRepository;
    private final VehicleTypeRepository vehicleTypeRepository;
    @Override
    public DriverVO create(DriverDTO dto) {
        VehicleTypeEntity vehicleType = vehicleTypeRepository.findByType(dto.getVehicleType());
        UserEntity user = new UserEntity();
        user.setMobilePhone(dto.getMobilePhone());
        user.setPassword(HashUtils.hashPassword(dto.getPassword()));
        user.setType(UserTypeEnum.DRIVER);
        user.setStatus(StatusEnum.ACTIVE);
        user.setCreatedDate(new Date());
        user.setModifiedDate(new Date());
        userRepository.save(user);
        DriverEntity entity = driverMapper.toEntity(dto);
        entity.setStatus(StatusEnum.ACTIVE);
        entity.setCreatedDate(new Date());
        entity.setModifiedDate(new Date());
        entity.setUserId(user.getId());
        entity.setVehicleType(vehicleType.getType());
        return driverMapper.toVO(driverRepository.save(entity));
    }
}
