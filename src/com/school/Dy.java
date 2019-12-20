package com.school;

public class Dy {
	public Dy() {
		System.out.println("构造方法一被调用");
	}
	public Dy(int z) {
		//this关键字指代本身
		this();
		System.out.println("构造方法二被调用");
	}
	public Dy(boolean b) {
		//this关键字指代本身
		this(1);
		System.out.println("构造方法三被调用");
	}
	
	
	public static void main(String[] args) {
		Dy test=new Dy (true);
	}
}