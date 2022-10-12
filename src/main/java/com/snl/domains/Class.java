package com.snl.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
public class Class {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = " Please, enter your a class name ")
	@Column(length = 50, nullable=false)
	private String className;
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "codeClass")
	@SequenceGenerator(name = "codeClass",initialValue = 1111, allocationSize = 11)
	private String classCode;
	
	
}
