package com.snl.domains;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable=false)
	private String firstName;
	
	@Column(length = 50, nullable=false)
	private String lastName;
	
	@Email
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable=false)
	private LocalDate dateOfBirth;
	

}
