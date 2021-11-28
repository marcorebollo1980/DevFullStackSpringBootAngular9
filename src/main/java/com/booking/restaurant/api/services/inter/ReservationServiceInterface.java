package com.booking.restaurant.api.services.inter;

import java.util.List;

import com.booking.restaurant.api.exceptions.BookingException;
import com.booking.restaurant.api.jsons.ReservationRest;

public interface ReservationServiceInterface {
	
    ReservationRest getReservationById(Long restaurantId) throws BookingException;
	
	public List<ReservationRest> getReservations() throws BookingException;

}
