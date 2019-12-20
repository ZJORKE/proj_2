package com.jicheng;
class Animal{
	String name;
	//定义动物的叫
	public Animal() {
	System.out.println("动物");
		}
	public Animal(String name) {
		System.out.println("周知良是一只猪   "+name);
			}
	void shout() {
		System.out.println("他发出哼哼哼的叫声");
		
	}
}
//定义dog类继承Animal类
class Dog extends Animal{
	public Dog() {
		super("超级可爱");
	}
	public void printName() {
	System.out.println("我的狗是"+name);
	}
	@Override//重写  前面的Override是注释
	void shout() {
		super.shout();
		System.out.println("它的叫声是：汪汪汪  啊呜");
			}
}
//定义测试类
public class E01{
	public static void main(String[] args) {
		Dog dog=new Dog();
		/*dog.name="阿拉斯加";
		dog.printName();//调用自己的方法
		dog.shout();//刁永磊继承的方法*/
	}
}

