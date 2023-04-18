package com.techelly.restapiusingh2db.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

//import javax.persistence.Column;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity// JPA annotation
@Table(name="student_details") // JPA annotation
public class Student {
	// JPA annotation
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)// JPA annotation
	private Integer studentId; // In relational database this property will be a primary key column
	@Column(name="studentname") // JPA annotation optional
	private String name;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dateOfBirth;

	
}
