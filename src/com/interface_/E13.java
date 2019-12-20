package com.interface_;
interface  Animal{
	//必须重写父类中的抽象方法
	//接口没有成员变量
	//只有public static final的成员变量
	//public static final 三个关键字可以省略
	public static final int ID=2;
	//abstract    抽象方法
	//接口中的方法都是public abstract
	//public abstract 两个关键字可以省略
	void shout();
	static int getID() {
		return Animal.ID;
		
	}
}
interface LandAnimal extends Animal{
	void run();
}

class Dog implements LandAnimal{
	public  void shout() {
		System.out.println("汪汪汪...");
		
	}

	@Override
	public void run() {
		System.out.println("小狗崽子");
		}
}
//定义测试类
public class E13 {
	public static void main(String[] args) {
	Dog dog=new Dog();
	dog.run();
	dog.shout();
	System.out.println(Animal.getID());
	}
}
