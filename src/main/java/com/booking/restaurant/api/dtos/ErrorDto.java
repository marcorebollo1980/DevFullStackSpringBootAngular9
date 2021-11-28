package com.booking.restaurant.api.dtos;

import java.io.Serializable;

import lombok.Data;

@Data
public class ErrorDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	
	private String value;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public ErrorDto(String nombre, String value) {
		this.nombre = nombre;
		this.value = value;
	}
	
}
