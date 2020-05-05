package com.raghav.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.raghav.demo.model.Alien;

public interface AlienRepository extends JpaRepository<Alien, Integer> {

	List<Alien> findByTech(String tech);

	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech);

}
