package com.example.flazon_api;

import jakarta.persistence.*;

@Entity
@Table(name= "Student")
public class Student {

	@Id 	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int StuID;
	
	private String Email;
	
	private String Name;
	


	public int getStuID() {
		return StuID;
	}

	public void setStuID(int stuID) {
		StuID = stuID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

}
