package com.zifuchuan;

public class E05 {
	public static void main(String[] args) {
		String s1="Starter";
		String s2="st";
		System.out.println("判断是否已字符串St开头:"+s1.startsWith("St"));
		System.out.println("判断是否已字符串er结尾:"+s1.endsWith("er"));
		System.out.println("判断是否包含字符ar:"+s1.contains("ar"));
		System.out.println("判断字符串是否为空:"+s1.isEmpty());
		System.out.println("判断两个字符串是否相等:"+s1.equals(s2));
	}
}
