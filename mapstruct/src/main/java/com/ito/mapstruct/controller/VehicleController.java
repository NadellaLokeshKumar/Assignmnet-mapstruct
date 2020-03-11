package com.ito.mapstruct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleDTO;
import com.ito.mapstruct.dto.VehicleLocationDTO;
import com.ito.mapstruct.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	public VehicleService vehicleService;
	
	@PostMapping(path = "/addVehicle", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public VehicleDTO addVehicle(@RequestBody Vehicle vehilce) {
		VehicleDTO vehicleDto = vehicleService.addVehilce(vehilce);
		if(vehicleDto != null) {
			return vehicleDto;
		}else {
			return null;
		}
	}
	
	@PostMapping(path = "/addVehicleDto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Vehicle addVehicleDTO(@RequestBody VehicleDTO vehilceDto) {
		Vehicle vehicle = vehicleService.addVehilceDto(vehilceDto);
		if(vehicle != null) {
			return vehicle;
		}else {
			return null;
		}
	}

}
