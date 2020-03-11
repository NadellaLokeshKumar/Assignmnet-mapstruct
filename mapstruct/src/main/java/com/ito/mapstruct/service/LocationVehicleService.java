package com.ito.mapstruct.service;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.LocationVehicleDTO;

public interface LocationVehicleService {

	public LocationVehicleDTO addLocationVehicleDTO(Location location);

	public Location addLocationVehicle(LocationVehicleDTO locationVehicleDTO);

}
