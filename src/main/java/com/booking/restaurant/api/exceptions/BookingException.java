package com.booking.restaurant.api.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.booking.restaurant.api.dtos.ErrorDto;

public class BookingException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8854573455831538632L;
	
	private final String code;
	
	private final int respondeCode;
	
	
	
	public String getCode() {
		return code;
	}

	public int getRespondeCode() {
		return respondeCode;
	}

	public List<ErrorDto> getErrorList() {
		return errorList;
	}

	private final List<ErrorDto> errorList = new ArrayList<>();

	public BookingException(String code, int respondeCode, String message) {
		super(message);
		this.code = code;
		this.respondeCode = respondeCode;
	}

	public BookingException(String code, int respondeCode, String message, List<ErrorDto> errorList) {
		super(message);
		this.code = code;
		this.respondeCode = respondeCode;
		this.errorList.addAll(errorList);
	}    
	
}
