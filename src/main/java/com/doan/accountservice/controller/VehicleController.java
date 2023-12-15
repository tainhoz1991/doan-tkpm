package com.doan.accountservice.controller;

import com.doan.accountservice.dto.VehicleTypeDTO;
import com.doan.accountservice.service.VehicleTypeService;
import com.doan.accountservice.vo.VehicleTypeVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class VehicleController {

    private final VehicleTypeService vehicleTypeService;
    @GetMapping("/vehicle-types")
    public List<VehicleTypeVO> getAll(){
        return vehicleTypeService.getAll();
    }

    @PostMapping("/vehicle-type")
    public VehicleTypeVO create(@RequestBody VehicleTypeDTO dto){
        return vehicleTypeService.create(dto);
    }
}
