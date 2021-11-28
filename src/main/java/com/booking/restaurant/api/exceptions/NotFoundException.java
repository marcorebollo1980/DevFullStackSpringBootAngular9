package com.booking.restaurant.api.exceptions;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpStatus;

import com.booking.restaurant.api.dtos.ErrorDto;

public class NotFoundException extends BookingException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1153424282129680773L;

	public NotFoundException(String code, String message) {
		super(code, HttpStatus.NOT_FOUND.value(), message);
	}
	
	public NotFoundException(String code, String message, ErrorDto data) {
		super(code, HttpStatus.NOT_FOUND.value(), message, Arrays.asList(data));
	}
	

}
