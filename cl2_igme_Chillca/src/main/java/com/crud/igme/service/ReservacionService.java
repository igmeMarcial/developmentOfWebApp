package com.crud.igme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crud.igme.entity.Reservacion;
import com.crud.igme.repository.ReservationRepository;

@Service
public class ReservacionService {
	@Autowired
	private ReservationRepository bRepo;
	
	public void save(Reservacion b) {
		bRepo.save(b);
	}
	public List<Reservacion> getAllHabi(){
		return bRepo.findAll();
	}
	public Reservacion getById(int id) {
		return bRepo.findById(id).get();
	}
	public void deleteById(int id) {
		bRepo.deleteById(id);
	}
	
}
