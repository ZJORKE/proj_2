package com.io;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID=1L;
	
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name;
	}
	
	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
