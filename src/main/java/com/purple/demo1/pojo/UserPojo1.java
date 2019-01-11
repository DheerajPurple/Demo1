package com.purple.demo1.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.*;

@Data
@Entity
public class UserPojo1 {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private int age;
	
	
}
