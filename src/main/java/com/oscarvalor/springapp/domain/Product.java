package com.oscarvalor.springapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products") 
public class Product implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String descripcion;
    private Double precio;
    
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    } 
    
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
