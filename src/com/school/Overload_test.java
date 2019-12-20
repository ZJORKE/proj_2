package com.school;

public class Overload_test {

	public static void main(String[] args) {
		//如果一个方法是静态方法，可以直接用类名来引用
		System.out.println (Overload.add(8,9));
		System.out.println (Overload.add(4.5,6));
		System.out.println (Overload.add(4.3,8.2));
		//不管方法是不是静态方法，都可以用对象名来引用
		Overload o1=new Overload();
		System.out.println(o1.add(5.3,3.7));
				
	}

}
