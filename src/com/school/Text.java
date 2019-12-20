package com.school;

import proj_2.Student;

public class Text {
	public static void main(String[] args) {
		//s1是这个类的对象名     student是类名
		//mew关键字用来创建一个student类，类名后面要有一个小括号
		Student s1=new Student();
		s1.setScore(520);
		s1.setName("zhangchuanpao");
		System.out.println(s1.getName()+"考了"+s1.getScore());
		Student s2=new Student("zhangdaxun",720);
		System.out.println(s2.getName()+"考了"+s2.getScore());
		Student s3=new Student("zhaosanpao",630);
		System.out.println(s3.getName()+"考了"+s3.getScore());
		
		Course  c1=new Course();
		c1.setCourse_id("java程序设计");
		c1.setCourse_name("java基础");
		c1.setCourse_book("java基础入门");
		 
		
	System.out.println(c1.getCourse_id());
	System.out.println(c1.getCourse_name()+"这门课常使用的教材是《"+c1.getCourse_book()+"》");
	}

}
