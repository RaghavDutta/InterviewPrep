package com.raghav.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.raghav.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens",path = "aliens")
public interface AlienRepository extends JpaRepository<Alien, Integer> {

}
