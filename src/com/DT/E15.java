package com.DT;

interface Animal{
	void shout();
}
class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("喵喵..");
		}
	public void catchMouse() {
		System.out.println("小猫捉老鼠");
		}
	}
class Dog implements Animal{
	@Override
	public void shout() {
		System.out.println("旺旺..");
		}
	}
class E15 {
	public static void main(String[] args) {
		Animal  an1=new Cat();
		an1.shout();
		Animal  an2=new Dog();
		an2.shout();
		
		if(an1 instanceof Cat) {
		Cat mao=(Cat) an1;
		mao.catchMouse();
		}
	else {
		System.out.println("该类型不是Cat类型");
		}
	}

}
