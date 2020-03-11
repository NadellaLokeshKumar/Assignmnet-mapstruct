package com.ito.mapstruct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleLocationDTO;
import com.ito.mapstruct.service.VehicleLocationService;

@RestController
public class VehicleLocationController {

	@Autowired
	public VehicleLocationService locationService;
	
	@PostMapping(path = "/addLocation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Location addLocation(@RequestBody Location location) {
		Location location1 = locationService.addLocation(location);
		if (location1 != null) {
			return location1;
		} else {
			return null;
		}
	}
	
	@PostMapping(path = "/addVehicleLocationDto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public VehicleLocationDTO addVehicleLocationDto(@RequestBody Vehicle vehicle) {
		VehicleLocationDTO vehicleLocationDTO = locationService.addVehicleLocationDTO(vehicle);
		if (vehicleLocationDTO != null) {
			return vehicleLocationDTO;
		} else {
			return null;
		}
	}
	
	@PostMapping(path = "/addVehicleLocation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Vehicle addVehicleLocationDto(@RequestBody VehicleLocationDTO vehicleLocationDTO) {
		Vehicle vehicle =  locationService.addVehicleLocation(vehicleLocationDTO);
		if (vehicle != null) {
			return vehicle;
		} else {
			return null;
		}
	}

}
