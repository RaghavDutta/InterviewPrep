package com.raghav.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.raghav.demo.model.Alien;

public interface AlienRepository extends CrudRepository<Alien, Integer> {

	List<Alien> findByTech(String tech);

	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);

}
