package clases;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	private int codigoHotel;
    private String nombre;
    private String direccion;
    private String sitioWeb;
    
    public Hotel() {
        // Constructor sin argumentos
    }
    // Constructor
    public Hotel(int codigoHotel, String nombre, String direccion, String sitioWeb) {
        this.codigoHotel = codigoHotel;
        this.nombre = nombre;
        this.direccion = direccion;
        this.sitioWeb = sitioWeb;
    }

    // Getters y Setters
    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
}
