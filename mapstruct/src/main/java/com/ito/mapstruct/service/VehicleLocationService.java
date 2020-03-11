package com.ito.mapstruct.service;

import java.util.ArrayList;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleLocationDTO;

public interface VehicleLocationService {

	public VehicleLocationDTO addVehicleLocationDTO(Vehicle vehicle);

	public Location addLocation(Location location);

	public Vehicle addVehicleLocation(VehicleLocationDTO vehicleLocationDTO);


}
