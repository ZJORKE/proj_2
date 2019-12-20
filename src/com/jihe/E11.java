package com.jihe;

import java.util.TreeSet;

public class E11 {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(3);
		ts.add(5);
		ts.add(4);
		ts.add(17);
		System.out.println("创建的TreeSet集合为:"+ts);
		System.out.println("TreeSet集合首元素为:"+ts.first());
		System.out.println("TreeSet集合尾部元素为:"+ts.last());
		System.out.println("集合中小于或等于9的最大的一个元素:"+ts.floor(9));
		System.out.println("集合中大于10的最小的一个元素为:"+ts.higher(10));
		System.out.println("集合中大于100的最小的一个元素为:"+ts.higher(100));
		
		Object first=ts.pollFirst();
		System.out.println("删除的第一个元素是:"+first);
		System.out.println("删除第一个元素后TreeSet集合变为:"+ts);
}
}