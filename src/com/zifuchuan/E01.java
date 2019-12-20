package com.zifuchuan;

public class E01 {
	public static void main(String[] args) {
		//创建一个字符串
		String str1="直接赋值的字符串";
		String str2=new String();
		String str3=new String("a,b,c");
		char[]charArray=new char[] {'A','B','C'};
		String str4=new String(charArray);
		
		System.out.println("a"+str1+"b");
		System.out.println(str3);
		System.out.println(str4);
	}

}
