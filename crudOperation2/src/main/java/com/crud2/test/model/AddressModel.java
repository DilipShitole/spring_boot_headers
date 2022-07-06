package com.crud2.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AddressModel {

	@Id
	@GeneratedValue
	private int id;
	private String city;
	private String dist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public AddressModel(int id, String city, String dist) {
		super();
		this.id = id;
		this.city = city;
		this.dist = dist;
	}
	public AddressModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddressModel [id=" + id + ", city=" + city + ", dist=" + dist + "]";
	}
	
	
	
	
	
}
