package com.abstract_;
abstract class Animal{
	//必须重写父类中的抽象方法
	public abstract void shout();
}

class Dog extends Animal{
	public  void shout() {
		System.out.println("汪汪汪...");
		
	}
	
}
//定义测试类
public class E12 {
	public static void main(String[] args) {
	Dog dog=new Dog();
	dog.shout();
	}
}
