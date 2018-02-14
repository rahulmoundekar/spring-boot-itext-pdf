package com.boot.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.app.bean.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}