package com.rec.daythree;

public class Student {

	String name;
	int Regno;
	String dept ;
	int Age;
	Float per;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegno() {
		return Regno;
	}
	public void setRegno(int regno) {
		Regno = regno;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Float getPer() {
		return per;
	}
	public void setPer(Float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Regno=" + Regno + ", dept=" + dept + ", Age=" + Age + ", per=" + per + "]";
	}
	}


