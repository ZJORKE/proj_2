package com.jihe;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe_test {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("张振鑫");
		list.add("张晓琪");
		list.add("张晓珣");
		list.add("赵三炮");
		
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("张"));
		Stream<String>stream3=stream2.limit(3);
		stream3.forEach(j->System.out.println(j));
		
		System.out.println("=========");
		list.stream().filter(i->i.startsWith("张")).filter(h->h.length()>2).forEach(j->System.out.println(j));
		
		//collect：收集方法
		List<String> xlb=list.stream().filter(i->i.startsWith("张")).collect(Collectors.toList());
		System.out.println(xlb);
		
		String string=list.stream().filter(i->i.startsWith("张")).collect(Collectors.joining(" "));
		System.out.println(string);
	
	}
}
