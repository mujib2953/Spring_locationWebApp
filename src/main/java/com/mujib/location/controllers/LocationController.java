package com.mujib.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mujib.location.entities.Location;
import com.mujib.location.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService locationService;

	@RequestMapping("/createLoc")
	public String craeteLocation() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {

		Location savedLocation = locationService.saveLocation(location);
		String msg = "New record saved with Id " + savedLocation.getId();
		modelMap.addAttribute("msg", msg);

		return "createLocation";
	}

	@RequestMapping("/allLoc")
	public String showAllLocations(ModelMap modelMap) {

		List<Location> allLocationList = locationService.getAllLocation();

		modelMap.addAttribute("allLocations", allLocationList);

		return "allLocations";
	}
}
