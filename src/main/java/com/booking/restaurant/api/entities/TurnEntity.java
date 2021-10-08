/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.restaurant.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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

import lombok.Data;


@Entity
@Table(name = "TURN",schema = "c##desarrollo")
@NamedQueries({
    @NamedQuery(name = "TurnEntity.findAll", query = "SELECT t FROM TurnEntity t"),
    @NamedQuery(name = "TurnEntity.findById", query = "SELECT t FROM TurnEntity t WHERE t.id = :id"),
    @NamedQuery(name = "TurnEntity.findByName", query = "SELECT t FROM TurnEntity t WHERE t.name = :name")})
public class TurnEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TURN_SEQ")
    @SequenceGenerator(sequenceName = "TURN_SEQ", allocationSize = 1, name = "SEQ_ID_TURN")
    
    @Basic(optional = false)

    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;
    
    @JoinColumn(name = "RESTAURANT_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private RestaurantEntity restaurantId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RestaurantEntity getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(RestaurantEntity restaurantId) {
		this.restaurantId = restaurantId;
	}
    
    
}
