package com.booking.restaurant.api.services.inter;

import java.util.List;

import com.booking.restaurant.api.exceptions.BookingException;
import com.booking.restaurant.api.jsons.RestaurantRest;

public interface RestaurantServiceInterface {
	
	RestaurantRest getRestaurantById(Long restaurantId) throws BookingException;
	
	public List<RestaurantRest> getRestaurants() throws BookingException;
	
	

}
