package com.techelly.restapiusingh2db.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student_uni")
public class StudentUni {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)// JPA annotation
	@Column(name="student_id")
	private Integer studentId; // In relational database this property will be a primary key column
	@Column(name="student_name") // JPA annotation optional
	private String name;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dateOfBirth;
	//HAS-A relationship
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	public StudentUni() {
		// TODO Auto-generated constructor stub
	}
	public StudentUni(Integer studentId, String name, LocalDate dateOfBirth, Address address) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentUni [studentId=" + studentId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + "]";
	}
	
	
}
