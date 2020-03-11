package com.ito.mapstruct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.LocationVehicleDTO;
import com.ito.mapstruct.service.LocationVehicleService;

@RestController
public class LocationVehicleController {

	@Autowired
	public LocationVehicleService locationVehicleController;
	
	@PostMapping(path = "/addLocationVehicleDto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public LocationVehicleDTO addLocationVehicleDto(@RequestBody Location location) {
		LocationVehicleDTO locationVehicleDTO = locationVehicleController.addLocationVehicleDTO(location);
		if (locationVehicleDTO != null) {
			return locationVehicleDTO;
		} else {
			return null;
		}
	}
	
	@PostMapping(path = "/addLocationVehicle", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Location addLocationVehicleDto(@RequestBody LocationVehicleDTO locationVehicleDTO) {
		Location location = locationVehicleController.addLocationVehicle(locationVehicleDTO);
		if (location != null) {
			return location;
		} else {
			return null;
		}
	}
}
