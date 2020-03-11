package com.ito.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.LocationVehicleDTO;

@Mapper(componentModel = "spring")
public interface LocationVehicleDTOMapper {

	@Mapping(source = "location.locationId", target = "locationId")
	@Mapping(source = "location.locationName", target = "locationName")
	@Mapping(source = "location.address", target = "address")
	@Mapping(source = "location.vehicleList", target = "vehicleDTOList")
    LocationVehicleDTO locationVehicleToLocationVehicleDTO(Location location);
	

	@Mapping(source = "locationVehicleDTO.locationId", target = "locationId")
	@Mapping(source = "locationVehicleDTO.locationName", target = "locationName")
	@Mapping(source = "locationVehicleDTO.address", target = "address")
    Location LocationVehicleDTOTolocationVehicle(LocationVehicleDTO locationVehicleDTO);	
}
