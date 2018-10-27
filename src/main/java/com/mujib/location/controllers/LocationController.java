package com.mujib.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mujib.location.entities.Location;
import com.mujib.location.service.LocationService;
import com.mujib.location.util.EmailUtil;

@Controller
public class LocationController {

	@Autowired
	LocationService locationService;
	
	@Autowired
	EmailUtil emailUtility;
	
	@RequestMapping("/createLoc")
	public String craeteLocation() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {

		Location savedLocation = locationService.saveLocation(location);
		String msg = "New record saved with Id " + savedLocation.getId();
		modelMap.addAttribute("msg", msg);
		
		// --- sending a mail
		emailUtility.sendEmail("ansarimujiburrehman@gmail.com", "Test Subject", "Test Body.");
		
		return "createLocation";
	}

	@RequestMapping("/allLoc")
	public String showAllLocations(ModelMap modelMap) {

		List<Location> allLocationList = locationService.getAllLocation();

		modelMap.addAttribute("allLocations", allLocationList);

		return "allLocations";
	}

	@RequestMapping("deleteLoc")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {

		Location locationById = locationService.getLocationById(id);
		locationService.deleteLocation(locationById);

		List<Location> allLocationList = locationService.getAllLocation();

		modelMap.addAttribute("allLocations", allLocationList);
		return "allLocations";
	}
	
	@RequestMapping("editLoc")
	public String editLocation(@RequestParam("id") int id, ModelMap modelMap) {
		
		Location locationById = locationService.getLocationById(id);
		
		modelMap.addAttribute("activeLoc", locationById);
		
		return "editLocation";
	}
	
	@RequestMapping("updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap ) {
		
		locationService.saveLocation(location);
		
		List<Location> allLocationList = locationService.getAllLocation();
		modelMap.addAttribute("allLocations", allLocationList);
		
		return "allLocations";
	}
}
