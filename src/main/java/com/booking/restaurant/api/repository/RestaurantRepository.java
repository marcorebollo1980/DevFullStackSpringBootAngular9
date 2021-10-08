/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.restaurant.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.booking.restaurant.api.entities.RestaurantEntity;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {

	Optional<RestaurantEntity> findById(Long id);
	
	Optional<RestaurantEntity> findByName(String name);
	
	@Query("SELECT r FROM RestaurantEntity r")
	public List<RestaurantEntity> findAllRestaurants();
}
