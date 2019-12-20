package com.gc;

public class E06 {
	public static void main(String[] args) {
		String str="2019-10-12";
		System.out.println("今天是："+str.substring(8)+"号");
		System.out.println("本月是："+str.substring(5,7)+"月");
		System.out.println("今年是："+str.substring(0,4)+"年");
		String[] stringArray=str.split("-");
		for(int i=0;i<stringArray.length;i++) {
			System.out.println(stringArray[i]);
		}
		String s1="abcdedcba";
		System.out.println("今天是"+stringArray[0]+"年"+stringArray[1]+"月"+stringArray[2]);
	}
}
