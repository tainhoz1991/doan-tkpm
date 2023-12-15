package com.doan.accountservice.repository;

import com.doan.accountservice.entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<DriverEntity, Long> {
}
