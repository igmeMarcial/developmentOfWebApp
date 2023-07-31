package com.crud.igme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.igme.entity.Reservacion;

@Repository
public interface ReservationRepository  extends JpaRepository<Reservacion,Integer>{
	
}
