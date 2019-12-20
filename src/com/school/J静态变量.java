package com.school;


class Student{
	static String schoolName;
}
public class J静态变量 {
	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student();
		//静态变量可以用类名直接引用
		//如果没有static关键字，只能用该类的实例也就是对象来引用
		Student.schoolName="江汉艺术职业学院";
		System.out.println("我是"+stu1.schoolName+"的学生");
		System.out.println("我是"+stu2.schoolName+"的学生");
	}
}