/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booking.restaurant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.booking.restaurant.api.entities.BoardEntity;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long>{

    
}
