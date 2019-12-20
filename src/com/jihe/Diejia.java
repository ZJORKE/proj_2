package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diejia {
	public static void main(String[] args) {
		ArrayList<String>  list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		Iterator  dedai=list.iterator();
		while (dedai.hasNext()) {
			String mgys=(String) dedai.next();
			System.out.print(mgys+"");
		}
		System.out.println();
		for(Object dgys:list) {
			System.out.println(dgys+"");
		}
	}
}
