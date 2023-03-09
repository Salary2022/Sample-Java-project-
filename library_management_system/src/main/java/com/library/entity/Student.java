package com.library.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Student_Information")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="phone_no")
	private int phone;
	
	@Column(name="emailId")
	private String email;
	
	@Column(name="student_branch")
	private String branch;
	
	@Column(name="student_year")
	private int year;
	
	@OneToMany(mappedBy="student")
	private List<Book>  books= new ArrayList<>();

	@Builder
	public Student(String name, int phone, String email, String branch, int year) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.branch = branch;
		this.year = year;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public Object getPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPhone(Object phone2) {
		// TODO Auto-generated method stub
		
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}

	public Object getBranch() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBranch(Object branch2) {
		// TODO Auto-generated method stub
		
	}

	public Object getYear() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setYear(Object year2) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
