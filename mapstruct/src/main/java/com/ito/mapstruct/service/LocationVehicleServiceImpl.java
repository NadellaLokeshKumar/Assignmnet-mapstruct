package com.ito.mapstruct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.LocationVehicleDTO;
import com.ito.mapstruct.mapper.LocationVehicleDTOMapper;
import com.ito.mapstruct.mapper.VehicleDTOMapper;
import com.ito.mapstruct.repo.LocationRepo;
import com.ito.mapstruct.repo.VehicleRepo;

@Service
public class LocationVehicleServiceImpl implements LocationVehicleService{

	@Autowired
	public LocationRepo locationRepo;
	
	@Autowired
	public VehicleRepo vehicleRepo;
	
	@Autowired
	public VehicleDTOMapper vehicleDTOMapper;
	
	@Autowired
	public LocationVehicleDTOMapper locationVehicleDTOMapper;
	
	@Override
	public LocationVehicleDTO addLocationVehicleDTO(Location location) {
		
		return locationVehicleDTOMapper.locationVehicleToLocationVehicleDTO(locationRepo.save(location));
	}

	@Override
	public Location addLocationVehicle(LocationVehicleDTO locationVehicleDTO) {
		return locationRepo.save(locationVehicleDTOMapper.LocationVehicleDTOTolocationVehicle(locationVehicleDTO));
	}

}
