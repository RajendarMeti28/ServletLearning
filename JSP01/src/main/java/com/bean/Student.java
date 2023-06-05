package com.bean;

public class Student {
	
	
	static {
		System.out.println(".class is loading");
	}
	
	public Student(){
		System.out.println("Student class instantiated");
	}
	
	private int id;
	private String name;
	private String address;
	private int age;
	public int getId() {

		System.out.println("Student class getId()");
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		System.out.println("Student class getName()");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {

		System.out.println("Student class getAddress()");
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {

		System.out.println("Student class getAge()");
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	

}
