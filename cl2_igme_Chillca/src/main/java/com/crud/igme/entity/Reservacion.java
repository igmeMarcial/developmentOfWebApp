package com.crud.igme.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "reservacion")
public class Reservacion {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "codigoReserva")
	    private int codigoReserva;

	    @Column(name = "codigoHotel")
	    private int codigoHotel;

	    @Column(name = "codigoHuesped")
	    private int codigoHuesped;

	    @Column(name = "codigoHabitacion")
	    private int codigoHabitacion;

	    @Column(name = "fechaInicio")
	    private Date fechaInicio;

	    @Column(name = "fechaFin")
	    private Date fechaFin;
    public Reservacion() {
        // Constructor sin argumentos
    }
    // Constructor
    public Reservacion(int codigoReserva, int codigoHotel, int codigoHuesped, int codigoHabitacion, Date fechaInicio, Date fechaFin) {
        this.codigoReserva = codigoReserva;
        this.codigoHotel = codigoHotel;
        this.codigoHuesped = codigoHuesped;
        this.codigoHabitacion = codigoHabitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
 // Getters y Setters
    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public int getCodigoHuesped() {
        return codigoHuesped;
    }

    public void setCodigoHuesped(int codigoHuesped) {
        this.codigoHuesped = codigoHuesped;
    }

    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public String obtenerDatosReserva() {
        return "Código de Reserva: " + codigoReserva +
                "\nCódigo de Hotel: " + codigoHotel +
                "\nCódigo de Huésped: " + codigoHuesped +
                "\nCódigo de Habitación: " + codigoHabitacion +
                "\nFecha de Inicio: " + fechaInicio.toString() +
                "\nFecha de Fin: " + fechaFin.toString();
    }
}
