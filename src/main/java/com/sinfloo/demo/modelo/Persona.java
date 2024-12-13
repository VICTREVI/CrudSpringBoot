package com.sinfloo.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//para crear propiamente la tabla persona
@Table(name="persona")
public class Persona {
   //creando anotacion
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String telefono;
	//constructor implicito
	public Persona() {}
	//constructor explicito
	public Persona(int id,String name,String telefono) {
		super();
		this.id=id;
		this.name=name;
		this.telefono=telefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
