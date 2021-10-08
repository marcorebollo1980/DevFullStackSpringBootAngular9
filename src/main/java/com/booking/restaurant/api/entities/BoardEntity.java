/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.restaurant.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "BOARD",schema = "c##desarrollo")
@NamedQueries({
    @NamedQuery(name = "BoardEntity.findAll", query = "SELECT b FROM BoardEntity b"),
    @NamedQuery(name = "BoardEntity.findById", query = "SELECT b FROM BoardEntity b WHERE b.id = :id"),
    @NamedQuery(name = "BoardEntity.findByCapacity", query = "SELECT b FROM BoardEntity b WHERE b.capacity = :capacity"),
    @NamedQuery(name = "BoardEntity.findByNumberr", query = "SELECT b FROM BoardEntity b WHERE b.numberr = :numberr")})
public class BoardEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ")
    @SequenceGenerator(sequenceName = "BOARD_SEQ", allocationSize = 1, name = "SEQ_ID_BOARD")
    
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "CAPACITY")
    private Long capacity;
    
    @Column(name = "NUMBERR")
    private Long numberr;
    
    @JoinColumn(name = "RESTAURANT_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private RestaurantEntity restaurantId;
    
    public BoardEntity() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCapacity() {
		return capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	public Long getNumberr() {
		return numberr;
	}

	public void setNumberr(Long numberr) {
		this.numberr = numberr;
	}

	public RestaurantEntity getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(RestaurantEntity restaurantId) {
		this.restaurantId = restaurantId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
