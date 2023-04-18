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
@Table(name="student_bi")
public class StudentBi {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)// JPA annotation
	@Column(name="student_id")
	private Integer studentId; // In relational database this property will be a primary key column
	@Column(name="student_name") // JPA annotation optional
	private String name;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dateOfBirth;
	//HAS-A relationship
	@OneToOne(cascade=CascadeType.ALL) //Owning side of relationship
	@JoinColumn(name="address_id")
	private AddressBi addressBi;
	public StudentBi() {
		// TODO Auto-generated constructor stub
	}
	public StudentBi(Integer studentId, String name, LocalDate dateOfBirth, AddressBi addressBi) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.addressBi = addressBi;
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
	public AddressBi getAddressBi() {
		return addressBi;
	}
	public void setAddressBi(AddressBi addressBi) {
		this.addressBi = addressBi;
	}
	@Override
	public String toString() {
		return "StudentBi [studentId=" + studentId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", addressBi="
				+ addressBi + "]";
	}

	
}
