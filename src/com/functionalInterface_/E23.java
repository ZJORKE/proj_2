package com.functionalInterface_;
//声明这是一个无参数和无返回值类型的函数式接口，有且仅有一个抽象方法
@FunctionalInterface
interface Animal{
	void shout();
}
//声明这是一个无参数和无返回值类型的函数式接口，有且仅有一个抽象方法
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
public class E23 {
	public static void main(String[] args) {
		animalShout(()->System.out.println("无参、无返回值的函数式接口调用"));
		showSum(10,20,(a,b)->a+b);
	}
	private static void animalShout(Animal animal) {
		animal.shout();
	}

	public static void showSum(int a,int b,Calculate calculate) {
		System.out.println(a+"+"+b+"的和为:"+calculate.sum(a,b));
	}
}
