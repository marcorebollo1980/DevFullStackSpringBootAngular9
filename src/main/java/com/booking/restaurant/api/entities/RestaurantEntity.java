/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.restaurant.api.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "RESTAURANT",schema = "c##desarrollo")
@NamedQueries({
    @NamedQuery(name = "RestaurantEntity.findAll", query = "SELECT r FROM RestaurantEntity r"),
    @NamedQuery(name = "RestaurantEntity.findById", query = "SELECT r FROM RestaurantEntity r WHERE r.id = :id"),
    @NamedQuery(name = "RestaurantEntity.findByName", query = "SELECT r FROM RestaurantEntity r WHERE r.name = :name"),
    @NamedQuery(name = "RestaurantEntity.findByDescription", query = "SELECT r FROM RestaurantEntity r WHERE r.description = :description"),
    @NamedQuery(name = "RestaurantEntity.findByAddress", query = "SELECT r FROM RestaurantEntity r WHERE r.address = :address"),
    @NamedQuery(name = "RestaurantEntity.findByImage", query = "SELECT r FROM RestaurantEntity r WHERE r.image = :image")})
public class RestaurantEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id    
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESTAURANT_SEQ")
    @SequenceGenerator(sequenceName = "RESTAURANT_SEQ", allocationSize = 1, name = "SEQ_ID_RESTAURANT")
    
    @Basic(optional = false)

    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "IMAGE")
    private String image;
    @Lob
    @Column(name = "IMAGE_2")
    private Serializable image2;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restauranteId")
    private List<ReservationEntity> reservations;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurantId")
    private List<BoardEntity> boards;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurantId")
    private List<TurnEntity> turns;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Serializable getImage2() {
		return image2;
	}

	public void setImage2(Serializable image2) {
		this.image2 = image2;
	}

	public List<ReservationEntity> getReservations() {
		return reservations;
	}

	public void setReservations(List<ReservationEntity> reservations) {
		this.reservations = reservations;
	}

	public List<BoardEntity> getBoards() {
		return boards;
	}

	public void setBoards(List<BoardEntity> boards) {
		this.boards = boards;
	}

	public List<TurnEntity> getTurns() {
		return turns;
	}

	public void setTurns(List<TurnEntity> turns) {
		this.turns = turns;
	}
    
    
}
