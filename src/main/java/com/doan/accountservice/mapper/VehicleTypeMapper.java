package com.doan.accountservice.mapper;

import com.doan.accountservice.dto.VehicleTypeDTO;
import com.doan.accountservice.entities.VehicleTypeEntity;
import com.doan.accountservice.vo.VehicleTypeVO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleTypeMapper {

    VehicleTypeVO toVO(VehicleTypeEntity entity);
    List<VehicleTypeVO> toVOs(List<VehicleTypeEntity> entities);
    VehicleTypeEntity toEntity(VehicleTypeDTO dto);
}
