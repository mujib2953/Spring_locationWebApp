package com.mujib.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mujib.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

	@Query(value = "SELECT type, count(*) FROM location_table GROUP BY type", nativeQuery = true)
	public List<Object[]> findTypeAndTypeCount();

}
