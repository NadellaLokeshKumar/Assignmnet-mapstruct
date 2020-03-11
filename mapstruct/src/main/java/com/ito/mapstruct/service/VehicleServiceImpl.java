package com.ito.mapstruct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleDTO;
import com.ito.mapstruct.dto.VehicleLocationDTO;
import com.ito.mapstruct.mapper.VehicleDTOMapper;
import com.ito.mapstruct.mapper.VehicleLocationDTOMapper;
import com.ito.mapstruct.repo.LocationRepo;
import com.ito.mapstruct.repo.VehicleRepo;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	public VehicleRepo vehicleRepo;
	
	@Autowired
	public VehicleDTOMapper vehicleDTOMapper;
	
	@Autowired
	public VehicleLocationDTOMapper vehicleLocationDTOMapper;
	
	@Override
	public VehicleDTO addVehilce(Vehicle vehilce) {
		return vehicleDTOMapper.vehicleToVehicleDTO(vehicleRepo.save(vehilce));	 
	}

	@Override
	public Vehicle addVehilceDto(VehicleDTO vehilce) {
		return vehicleRepo.save(vehicleDTOMapper.VehicleDTOToVehicle(vehilce));	 
	}

}
