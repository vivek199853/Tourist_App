package com.tourist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tourist {
	@Id
	
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String fromPlace;
	private int numberOfdays;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public int getNumberOfdays() {
		return numberOfdays;
	}
	public void setNumberOfdays(int numberOfdays) {
		this.numberOfdays = numberOfdays;
	}
	public Tourist(int id, String firstName, String lastName, String gender, int age, String fromPlace,
			int numberOfdays) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.fromPlace = fromPlace;
		this.numberOfdays = numberOfdays;
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
