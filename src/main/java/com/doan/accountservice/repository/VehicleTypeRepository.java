package com.doan.accountservice.repository;

import com.doan.accountservice.entities.VehicleTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleTypeEntity, Long> {
    VehicleTypeEntity findByType(String vehicleType);
}
