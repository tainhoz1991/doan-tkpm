package com.doan.accountservice.mapper;

import com.doan.accountservice.dto.CustomerDTO;
import com.doan.accountservice.entities.CustomerEntity;
import com.doan.accountservice.vo.CustomerVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerVO toVO(CustomerEntity entity);
    CustomerEntity toEntity(CustomerDTO dto);
}
