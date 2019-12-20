package com.jihe;

import java.util.HashSet;

class student{
		String id;
		String name;
		public student(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public student() {
			super();
			// TODO 自动生成的构造函数存根
		}
		@Override
		public String toString() {
			return id +":"+name;
		}
		@Override
		public int hashCode() {
			return id.hashCode();
		}
			
		@Override
		public boolean equals(Object obj) {
			student other = (student) obj;
			id.equals(other.id);
				return false;
		}
		
		
	}

public class HashSet_text {
	public static void main(String[] args) {
		
		student stu1=new student("1","Nike");
		student stu2=new student("2","Rom");
		student stu3=new student("3","Lily");
	HashSet hsj=new HashSet<>();
		hsj.add(stu1);
		hsj.add(stu2);
		hsj.add(stu3);
	System.out.println(hsj);
	}

	
	
}
