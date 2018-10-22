package com.mujib.location;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mujib.location.entities.Location;
import com.mujib.location.repos.LocationRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationWebAppApplicationTests {
	
	@Autowired
	private LocationRepository locationRepos;
	
	@Test
	public void creatLocation() {
		Location location = new Location();
		
		location.setName("New York City");
		location.setCode("NYC");
		location.setType("URBAN");
		
		locationRepos.save( location );
	}

}
