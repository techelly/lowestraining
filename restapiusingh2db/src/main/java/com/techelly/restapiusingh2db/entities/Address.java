package com.techelly.restapiusingh2db.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString**/
@Entity
@Table(name="address_onetoone_uni")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="address_id")
	private Integer id;
	private String street;
	private String city;
	private String country;
	private Integer pinCode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(Integer id, String street, String city, String country, Integer pinCode) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", country=" + country + ", pinCode="
				+ pinCode + "]";
	}
	
	
}

