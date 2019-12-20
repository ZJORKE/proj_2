package com.functionalInterface_;
@FunctionalInterface
interface Calcable{
	int calc(int num);
}
class Math{
	public static int abs(int num){
		if (num<0) {
			return-num;
		}
		else {
			return num;
		}
		
	}
}
public class E24 {
	private static void printAbs(int num,Calcable calcable) {
	System.out.println(calcable.calc(num));	
	}
	public static void main(String[] args) {	
		//使用lambda表达式方法
		printAbs(-10,(n)->Math.abs(n));
		//使用方法引用的方式  类名：静态方法名 来替换lamda表达式
		printAbs(-10,Math::abs);
	}
}
