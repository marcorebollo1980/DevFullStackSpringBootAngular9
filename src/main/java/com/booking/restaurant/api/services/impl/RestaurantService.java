/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.restaurant.api.services.impl;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.restaurant.api.entities.RestaurantEntity;
import com.booking.restaurant.api.exceptions.BookingException;
import com.booking.restaurant.api.exceptions.NotFoundException;
import com.booking.restaurant.api.jsons.RestaurantRest;
import com.booking.restaurant.api.repository.RestaurantRepository;
import com.booking.restaurant.api.services.inter.RestaurantServiceInterface;

@Service
public class RestaurantService implements RestaurantServiceInterface{

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public static final ModelMapper model = new ModelMapper();
	
	@Override
	public RestaurantRest getRestaurantById(Long restaurantId) throws BookingException {
		return model.map(getRestaurantEntity(restaurantId), RestaurantRest.class);
	}
	
	@Override
	public List<RestaurantRest> getRestaurants() throws BookingException {
		
		final List<RestaurantEntity> restauranteList = restaurantRepository.findAll();
		
		List<RestaurantRest> restaurantResList = new ArrayList<>();
		for (RestaurantEntity restaurantEntity : restauranteList) {
			RestaurantRest rest = model.map(restaurantEntity, RestaurantRest.class);
			restaurantResList.add(rest);
		}
		return restaurantResList;
	}
	
	
//	public List<PersonRest> findAllPeople() {
//		List<Person> people = personRepository.findAll();	
//		ModelMapper modelMapper = new ModelMapper();
//		List<PersonRest> peopleRestList = new ArrayList<>();
//		for (Person person : people) {
//			PersonRest peopleRest = modelMapper.map(person, PersonRest.class);
//			peopleRestList.add(peopleRest);
//		}
//		return peopleRestList;
//	}
//	
	
//	public List<PersonRest> findAllPeople() {
//		List<Person> people = personRepository.findAll();	
//		ModelMapper modelMapper = new ModelMapper(); 
//		List<PersonRest> peopleRestList = new ArrayList<>();
//		people.forEach(person -> peopleRestList.add(modelMapper.map(person,  PersonRest.class)));
//		return peopleRestList;
//	}
	
	
	
	
    private RestaurantEntity getRestaurantEntity(Long restaurantId) throws BookingException{	
		return restaurantRepository.findById(restaurantId).orElseThrow(()-> new NotFoundException("SNOT-404-1", "RESTAURANT_NOT_FOUND"));
    }


	
	

}
