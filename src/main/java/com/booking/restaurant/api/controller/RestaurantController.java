/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.restaurant.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiRest/Restaurant")
public class RestaurantController{
	
	@GetMapping("/sumaPrueba/{parametro1}/{parametro2}")
	public int sumaPrueba(@PathVariable int parametro1, @PathVariable int parametro2) {
		int suma;
		return suma = parametro1 + parametro2;
	}
	
	@GetMapping("/restaPrueba")
	public int restaPrueba(@RequestParam int parametro1, @RequestParam int parametro2) {
		int suma;
		return suma = parametro1 + parametro2;
	}

}
