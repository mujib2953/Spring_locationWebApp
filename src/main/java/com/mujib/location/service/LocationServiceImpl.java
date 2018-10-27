package com.mujib.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mujib.location.entities.Location;
import com.mujib.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getLocationById(int location_id) {
		return repository.findById(location_id).get();
	}

	@Override
	public List<Location> getAllLocation() {
		return repository.findAll();
	}

}
