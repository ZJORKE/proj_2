package com.DT;

class Outer{
	  static int m=0;
	void test1() {
		System.out.println("外部类成员方法");
	}
	void test2() {
		//定义局部内部类inner，在局部内部类中访问外部类变量和方法
		class Inner{
			int n=1;
			void show() {
				System.out.println("外部类变量m="+m);
				test1();
			}
		}
		//在创建局部内部类的方法中，调用局部内部类变量和方法
		Inner inner=new Inner();
		System.out.println("局部内部类变量 n="+inner.n);
		inner.show();
	}
	static class Inner{
		void show() {
			System.out.println("外部类变量m="+m);
		}
	}
}
//定义测试类
public class E19 {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.test2();
		
		Outer.Inner inner=new Outer.Inner();
		inner.show();
	}
}
