package com.example.litepaltwo;

import org.litepal.crud.DataSupport;


public class Student extends DataSupport{
	
	private int id;
	private String number;
	private String name;
	private String sex;
	public Student() {
		super();
	}
	
	public Student(int id, String number, String name, String sex) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
