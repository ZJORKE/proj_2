package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class E02 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		list.add("s4");
	//用lambda表达式来遍历集合里的每一个元素
	list.forEach(obj->System.out.println("迭代集合元素:"+obj));
	
	//使用JDK 8增加的forEachRemaining(Consumeraction)来遍历迭代器对象
	Iterator it=list.iterator();
	it.forEachRemaining(obj->System.out.println("迭代集合元素:"+obj));
	//用迭代来遍历集合里的每一个元素
	Iterator it1=list.iterator();
		while (it1.hasNext()) {
			Object obj=it1.next();
			if ("s1".equals(obj)) {
				list.remove(obj);
				break;
			}
			
	}
		System.out.println(list);
	}
}
