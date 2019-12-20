package com.school;

public class Overload {
	//实现两个整数相加
	public static int add(int x,int y) {
		return x+y;
	}
	//实现三个整数相加
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	//两个浮点数的加法
	public static double add(double x,double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		System.out.println (add(8,9));
		System.out.println (add(4.5,6));
		System.out.println (add(4.3,8.2));
		
	}
}
