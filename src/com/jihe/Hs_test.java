package com.jihe;

import java.util.HashSet;

class Person{
		String name;
		int age;
		public Person() {
			super();
			// TODO 自动生成的构造函数存根
		}
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		@Override
		public int hashCode() {
			return  name.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			Person other = (Person) obj;
			return name.equals(other.name);
		}
		@Override
		public String toString() {
			return name + ":" + age; 
		}
		
	}
public class Hs_test {
	public static void main(String[] args) {
		HashSet<Person> hsj=new HashSet<Person>();
		hsj.add(new Person("Jack",16));
		hsj.add(new Person("Lily",15));
		hsj.add(new Person("Rose",20));
	System.out.println(hsj);
	}
}
