package com.String;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.print.attribute.standard.PrinterLocation;

public class Collection_test {
	public static void main(String[] args) {
		//<>表示泛型，也就是集合里元素的类型
		ArrayList<String>  list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度:"+list.size());
		System.out.println("第二个元素是:"+list.get(1));
		
		LinkedList<String> List2=new LinkedList<String>();
		List2.add("stu1");
		List2.add("stu2");
		System.out.println(List2);
		List2.offer("offer");
		List2.push("push");
		System.out.println(List2);
		Object object=List2.peek();
		System.out.println(object);
		List2.removeFirst();
		List2.pollLast();
		System.out.println(List2);
		}
}
