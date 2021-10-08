/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.restaurant.api.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.booking.restaurant.api.entities.ReservationEntity;
import com.booking.restaurant.api.entities.RestaurantEntity;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

	Optional<ReservationEntity> findById(Long id);

	Optional<ReservationEntity> findByLocatorr(String locatorr);
	
	@Modifying
	@Transactional
	Optional<ReservationEntity> deleteByLocatorr(String locatorr);

	
	Optional<ReservationEntity> findByTurnAndRestauranteId(String tunr, Long restauranteId);	
	
    
}
