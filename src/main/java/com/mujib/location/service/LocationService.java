package com.mujib.location.service;

import java.util.List;

import com.mujib.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int location_id);

	List<Location> getAllLocation();
}
