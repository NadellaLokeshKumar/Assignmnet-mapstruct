package com.ito.mapstruct.dto;

import java.util.List;

import javax.persistence.Entity;

public class LocationVehicleDTO {

	private int locationId;			
	private String locationName;			
	private String address;	
	private List<VehicleDTO> vehicleDTOList;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<VehicleDTO> getVehicleDTOList() {
		return vehicleDTOList;
	}
	public void setVehicleDTOList(List<VehicleDTO> vehicleDTOList) {
		this.vehicleDTOList = vehicleDTOList;
	}
	
}
