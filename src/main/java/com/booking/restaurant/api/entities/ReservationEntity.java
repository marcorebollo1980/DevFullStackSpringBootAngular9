/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.restaurant.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Entity
@Data
@Table(name = "RESERVATION",schema = "c##desarrollo")
@NamedQueries({
    @NamedQuery(name = "ReservationEntity.findAll", query = "SELECT r FROM ReservationEntity r"),
    @NamedQuery(name = "ReservationEntity.findById", query = "SELECT r FROM ReservationEntity r WHERE r.id = :id"),
    @NamedQuery(name = "ReservationEntity.findByLocatorr", query = "SELECT r FROM ReservationEntity r WHERE r.locatorr = :locatorr"),
    @NamedQuery(name = "ReservationEntity.findByPerson", query = "SELECT r FROM ReservationEntity r WHERE r.person = :person"),
    @NamedQuery(name = "ReservationEntity.findByFecha", query = "SELECT r FROM ReservationEntity r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "ReservationEntity.findByTurn", query = "SELECT r FROM ReservationEntity r WHERE r.turn = :turn")})
public class ReservationEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESERVATION_SEQ")
    @SequenceGenerator(sequenceName = "RESERVATION_SEQ", allocationSize = 1, name = "SEQ_ID_RESERVATION")
    
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LOCATORR")
    private String locatorr;
    
    @Column(name = "PERSON")
    private Long person;
    
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "TURN")
    private String turn;
    
    @JoinColumn(name = "RESTAURANTE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private RestaurantEntity restauranteId;

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

	public RestaurantEntity getRestauranteId() {
		return restauranteId;
	}

	public void setRestauranteId(RestaurantEntity restauranteId) {
		this.restauranteId = restauranteId;
	}
    
    
}
