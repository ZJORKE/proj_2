package com.tostring;
//定义Animal类
class Animal{
	void shout() {
		System.out.println("动物叫");
	}
	//重写父类中Object中的tostring
	@Override
	public String toString() {
		return "这是一只可爱的猪";
		
	}
	
}
class Dog extends Animal{
	@Override
	public String toString() {
	return "这是一只纯白色的狗子";
		
	}
}
public class E06 {
	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog xg=new Dog();
	 	System.out.println(dw.toString());
		System.out.println(xg.toString());
	}

}
