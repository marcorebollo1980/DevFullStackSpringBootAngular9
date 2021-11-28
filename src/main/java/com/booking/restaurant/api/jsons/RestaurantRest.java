package com.booking.restaurant.api.jsons;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestaurantRest {
		
	@JsonProperty("id")
    private Long id;

	@JsonProperty("locatorr")
    private String locatorr;
    
	@JsonProperty("person")
    private Long person;
    
	@JsonProperty("fecha")
    private Date fecha;

	@JsonProperty("turn")
    private String turn;
    
   
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocatorr() {
		return locatorr;
	}

	public void setLocatorr(String locatorr) {
		this.locatorr = locatorr;
	}

	public Long getPerson() {
		return person;
	}

	public void setPerson(Long person) {
		this.person = person;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTurn() {
		return turn;
	}

	public void setTurn(String turn) {
		this.turn = turn;
	}
}
