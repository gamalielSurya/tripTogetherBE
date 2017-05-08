package com.gamaliel.surya.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamaliel.surya.model.City;


public interface CityRepository extends JpaRepository<City, Integer>{
	List<City> findByName(String name);
}
