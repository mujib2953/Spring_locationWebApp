package com.mujib.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mujib.location.entities.Location;
import com.mujib.location.repos.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

	@Autowired
	LocationRepository locationRepos;

	@GetMapping
	public List<Location> getLocation() {
		return locationRepos.findAll();
	}

	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return locationRepos.save(location);
	}

	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		locationRepos.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Location getLocation(@PathVariable int id) {
		return locationRepos.findById(id).get();
	}
}
