package com.crud.igme.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Habitacion")
public class Habitacion {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int codigoHabitacion;
    private int codigoHotel;
    private String tipo;
    private double precio;
    public Habitacion() {
    	
    }
	public Habitacion(int codigoHabitacion, int codigoHotel, String tipo, double precio) {
		super();
		this.codigoHabitacion = codigoHabitacion;
		this.codigoHotel = codigoHotel;
		this.tipo = tipo;
		this.precio = precio;
	}
	public int getCodigoHabitacion() {
		return codigoHabitacion;
	}
	public void setCodigoHabitacion(int codigoHabitacion) {
		this.codigoHabitacion = codigoHabitacion;
	}
	public int getCodigoHotel() {
		return codigoHotel;
	}
	public void setCodigoHotel(int codigoHotel) {
		this.codigoHotel = codigoHotel;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
    
}
