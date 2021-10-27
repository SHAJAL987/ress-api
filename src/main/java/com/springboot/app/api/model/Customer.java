package com.springboot.app.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String email;
	private String gender;
	private String name;
	
	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name="p_fk",referencedColumnName = "id")
	private List<Product>product;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String email, String gender, String name, List<Product> product) {
		super();
		this.id = id;
		this.email = email;
		this.gender = gender;
		this.name = name;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", gender=" + gender + ", name=" + name
				+ ", product=" + product + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
	
	
	
}
