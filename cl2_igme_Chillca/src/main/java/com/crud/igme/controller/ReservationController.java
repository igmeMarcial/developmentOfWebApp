package com.crud.igme.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import com.crud.igme.entity.Reservacion;
import com.crud.igme.service.ReservacionService;

@Controller
public class ReservationController {
	@Autowired
	private ReservacionService service;
	
	 // Método para convertir las fechas antes de realizar el Data Binding
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/registrar")
	public String reservationRegister() {
		
		return "registrar";
	}
	/*
	@GetMapping("/habitacionesReservadas")
	public String reservadas() {
		return "habitacionesReservadasLista";
	}
	*/
	@PostMapping("/save")
	public String addReservation(@ModelAttribute Reservacion b) {
		service.save(b);
		return "redirect:/habitacionesReservadas";
	}
	
	@GetMapping("/habitacionesReservadas")
	public ModelAndView getAllHabi() {
		List<Reservacion>list=service.getAllHabi();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book",list);
		// Verificar los datos obtenidos en la consola del servidor
	    for (Reservacion reservacion : list) {
	        System.out.println("Reservacion: " + reservacion.toString());
	    }
		return new ModelAndView("habitacionesReservadasLista","habi",list);
	}
}
