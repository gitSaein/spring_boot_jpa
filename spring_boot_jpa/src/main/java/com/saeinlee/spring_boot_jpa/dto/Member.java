package com.saeinlee.spring_boot_jpa.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String username;
	private Integer age;
	
	protected Member() {}
	
	public Member(String username, Integer age) {
		this.username = username;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", username=" + username + ", age=" + age + "]";
	}
	
	

}
