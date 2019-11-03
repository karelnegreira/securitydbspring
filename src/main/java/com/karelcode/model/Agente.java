package com.karelcode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agente {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String location;
	
	public Agente() {
		
	}
	
	public Agente(String name, String location) {
		this.name = name;
		this.location = location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Agente [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
