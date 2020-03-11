package com.ito.mapstruct.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleLocationDTO;
import com.ito.mapstruct.mapper.VehicleDTOMapper;
import com.ito.mapstruct.mapper.VehicleLocationDTOMapper;
import com.ito.mapstruct.repo.LocationRepo;
import com.ito.mapstruct.repo.VehicleRepo;

@Service
public class VehicleLocationServiceImpl implements VehicleLocationService {
	
	@Autowired
	public LocationRepo locationRepo;
	
	@Autowired
	public VehicleRepo vehicleRepo;
	
	@Autowired
	public VehicleDTOMapper vehicleDTOMapper;
	
	@Autowired
	public VehicleLocationDTOMapper vehicleLocationDTOMapper;
	
	@Override
	public Location addLocation(Location location) {
		return locationRepo.save(location);
	}

	@Override
	public VehicleLocationDTO addVehicleLocationDTO(Vehicle vehicle) {
		return vehicleLocationDTOMapper.vehicleLocationtoVehicleLocationDTO(vehicleRepo.save(vehicle));
	}

	@Override
	public Vehicle addVehicleLocation(VehicleLocationDTO vehicleLocationDTO) {
		return vehicleRepo.save(vehicleLocationDTOMapper.vehicleLocationDTOtoVehicle(vehicleLocationDTO));
	}

	
}
