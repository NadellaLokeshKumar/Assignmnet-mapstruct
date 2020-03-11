package com.ito.mapstruct.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleDTO;

@Mapper(componentModel = "spring")
public interface VehicleDTOMapper {

	VehicleDTOMapper INSTANCE = Mappers.getMapper(VehicleDTOMapper.class);

	@Mapping(source = "vehicleId", target = "vehicleId")
	@Mapping(source = "vehicleModel", target = "vehicleModel")
	@Mapping(source = "fuelCapacity", target = "fuelCapacity")
	VehicleDTO vehicleToVehicleDTO(Vehicle vehicle);

	@InheritInverseConfiguration
	@Mapping(target = "vehicleId")
	@Mapping(target = "vehicleModel")
	@Mapping(target = "fuelCapacity")
	Vehicle VehicleDTOToVehicle(VehicleDTO vehicleDTO);
}



