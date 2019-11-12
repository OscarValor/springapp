package com.oscarvalor.springapp.domain;

import java.io.Serializable;

public class Product implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    private String descripcion;
    private Double precio;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + descripcion + ";");
        buffer.append("Price: " + precio);
        return buffer.toString();
    }
// NO CREO CONSTRUCTOR POR DEFECTO NOS GENERA Product();  
//	public Product(String descripcion, Double precio) {
//		super();
//		this.descripcion = descripcion;
//		this.precio = precio;
//	}
//    
    


}
