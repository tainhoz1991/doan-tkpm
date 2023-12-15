package com.doan.accountservice.service.impl;

import com.doan.accountservice.dto.CustomerDTO;
import com.doan.accountservice.entities.CustomerEntity;
import com.doan.accountservice.entities.UserEntity;
import com.doan.accountservice.enums.StatusEnum;
import com.doan.accountservice.enums.UserTypeEnum;
import com.doan.accountservice.mapper.CustomerMapper;
import com.doan.accountservice.repository.CustomerRepository;
import com.doan.accountservice.repository.UserRepository;
import com.doan.accountservice.service.CustomerService;
import com.doan.accountservice.utils.HashUtils;
import com.doan.accountservice.vo.CustomerVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final UserRepository userRepository;
    @Override
    public CustomerVO create(CustomerDTO dto) {
        UserEntity user = new UserEntity();
        user.setMobilePhone(dto.getMobilePhone());
        user.setPassword(HashUtils.hashPassword(dto.getPassword()));
        user.setType(UserTypeEnum.CUSTOMER);
        user.setStatus(StatusEnum.ACTIVE);
        user.setCreatedDate(new Date());
        user.setModifiedDate(new Date());
        userRepository.save(user);
        CustomerEntity entity = customerMapper.toEntity(dto);
        entity.setStatus(StatusEnum.ACTIVE);
        entity.setCreatedDate(new Date());
        entity.setModifiedDate(new Date());
        entity.setUserId(user.getId());
        return customerMapper.toVO(customerRepository.save(entity));
    }
}
