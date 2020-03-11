package com.ito.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleLocationDTO;

@Mapper(componentModel = "spring")
public interface VehicleLocationDTOMapper {

	@Mapping(source = "vehicle.vehicleId", target = "vehicleId")
	@Mapping(source = "vehicle.vehicleModel", target = "vehicleModel")
	@Mapping(source = "vehicle.location.locationId", target = "locationId")
	@Mapping(source = "vehicle.location.locationName", target = "locationName")
	VehicleLocationDTO vehicleLocationtoVehicleLocationDTO(Vehicle vehicle);
	
	
	@Mapping(source = "vehicleLocationDTO.vehicleId", target = "vehicleId")
	@Mapping(source = "vehicleLocationDTO.vehicleModel", target = "vehicleModel")
	@Mapping(source = "vehicleLocationDTO.locationId", target = "location.locationId")
	@Mapping(source = "vehicleLocationDTO.locationName", target = "location.locationName")
	Vehicle vehicleLocationDTOtoVehicle(VehicleLocationDTO vehicleLocationDTO);
		
}
