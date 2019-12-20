package com.DT;
interface an{
	void shout();
	}
public class E16 {
	public static void main(String[] args) {
		String name="小花";
//第一种方式：
//外部类  外部类的对象=new  外部类()创建对象
//外部类的对象，方法名来调用方法实现功能
		
//第二种方式
//匿名内部类:作为方法的参数，有具体的的实现语句
		animalshout(new Animal() {
			public void shout() {
			System.out.println(name+"喵喵..")	;
				
			}
			
		});
//第三种方式：
//用lanmbda表达式作为参数传递给animalshout方法
//()对应shout方法后面的括号->是表达式箭牌{}里面的语句是方法主体
		animalshout(()->System.out.println("Lambda表达式输出:"+name+"喵喵"));
	}
		private static void animalshout(Animal an) {
			an.shout();
		
	}
}
