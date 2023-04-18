package com.techelly.restapiusingh2db.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


/**
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString**/
@Entity
@Table(name="address_onetoone_bi")
public class AddressBi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="address_id")
	private Integer id;
	private String street;
	private String city;
	private String country;
	private Integer pinCode;
	@OneToOne(mappedBy="addressBi") //inverse side in a relationship
	private StudentBi studentBi;
	public AddressBi() {
		// TODO Auto-generated constructor stub
	}
	public AddressBi(Integer id, String street, String city, String country, Integer pinCode, StudentBi studentBi) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
		this.studentBi = studentBi;
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
	public StudentBi getStudentBi() {
		return studentBi;
	}
	public void setStudentBi(StudentBi studentBi) {
		this.studentBi = studentBi;
	}
	@Override
	public String toString() {
		return "AddressBi [id=" + id + ", street=" + street + ", city=" + city + ", country=" + country + ", pinCode="
				+ pinCode + ", studentBi=" + studentBi + "]";
	}
	
}

