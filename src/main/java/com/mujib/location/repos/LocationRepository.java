package com.mujib.location.repos;

import org.springframework.data.repository.CrudRepository;

import com.mujib.location.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
