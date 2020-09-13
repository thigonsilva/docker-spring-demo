package com.example.dockerdemo.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data @ToString
@Entity
public class Test {

	@Id @GeneratedValue
	private Long id;
	
	private String message;
	
}
