package com.snl.domains;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = " Please, enter your first name ")
	@Column(length = 50, nullable=false)
	private String firstName;
	
	@NotBlank(message = " Please, enter your last name ")
	@Column(length = 50, nullable=false)
	private String lastName;
	
	@Column(length = 50, nullable=false)
	@Email
	private String email;
	
	@Column(nullable=false)
	private LocalDate dateOfBirth;
	
	

}
