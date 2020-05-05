package com.raghav.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.raghav.demo.model.Alien;

public interface AlienRepository extends CrudRepository<Alien, Integer> {

}
