package com.jihe;

import java.util.TreeSet;

class Teacher implements Comparable{
		String name;
		int age;
	public Teacher(String name,int age) {
			this.name=name;
			this.age=age;
		}
	public String toString() {
		return name+":"+age;
	}	
		@Override
		public int compareTo(Object obj) {
			Teacher s=(Teacher) obj;
			if(this.age-s.age >0) {
				return 1;
			}
			if(this.age-s.age==0) {
				return this.name.compareTo(s.name);
			}
			return -1;
		}
		
	}
public class E12 {
	public static void main(String[] args) {
		TreeSet<Teacher> tSet=new TreeSet<Teacher>();
		tSet.add(new Teacher("朱一龙", 30));
		tSet.add(new Teacher("罗云熙", 27));
		tSet.add(new Teacher("王一博", 22));
		tSet.add(new Teacher("易烊千玺", 18));
		System.out.println(tSet);
	}
}
