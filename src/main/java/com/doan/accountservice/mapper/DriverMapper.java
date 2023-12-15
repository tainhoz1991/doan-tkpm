package com.doan.accountservice.mapper;

import com.doan.accountservice.dto.DriverDTO;
import com.doan.accountservice.entities.DriverEntity;
import com.doan.accountservice.vo.DriverVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    DriverVO toVO(DriverEntity entity);
    DriverEntity toEntity(DriverDTO dto);
}
