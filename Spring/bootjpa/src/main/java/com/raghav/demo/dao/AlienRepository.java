package com.raghav.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.raghav.demo.model.Alien;

public interface AlienRepository extends JpaRepository<Alien, Integer> {

}
