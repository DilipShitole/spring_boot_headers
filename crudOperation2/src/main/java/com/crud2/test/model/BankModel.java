package com.crud2.test.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class BankModel {
	@Id
	@GeneratedValue
	private int id;
	private String name;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="Address_id")
	private AddressModel Address;
	
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
	
	@Override
	public String toString() {
		return "BankModel [id=" + id + ", name=" + name + "]";
	}
	public BankModel(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
	
	}
	public BankModel() {
		super();
		
	}
	
	

}
