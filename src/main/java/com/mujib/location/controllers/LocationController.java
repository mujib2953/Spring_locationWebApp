package com.mujib.location.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {
	
	@RequestMapping("/createLoc")
	public String craeteLocation() {
		return "createLocation";
	}
	
}
