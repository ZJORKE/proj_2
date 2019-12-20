package com.gc;

public class E54 {
	public static void main(String[] args) {
		String s="http://localhost :8080  ";
		//字符串去除空格操作
		System.out.println("去掉字符串两端的空格:"+s.trim());
		//去掉字符串所有的空格：把空格字符串替换为空字符串
		System.out.println("去掉字符串所有空格后的结果:"+s.replace("",""));
		//去掉字符串所有的空格：用正则表达式把空字符串替换为空字符串
		System.out.println("去掉字符串两端的空格："+s.replaceAll("\\s+",""));
	}
}
