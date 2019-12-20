package com.gc;
	class person extends Object{
		@Override
		public void finalize() {
			System.out.println("对象将会作为垃圾回收..");
		}
	}
public class E37 {
	 public static void recyclegWastel() {
		 person p1=new person();
		 p1=null;
		 int i=1;
		 while(i<10) {
			 System.out.println("方法1循环中..");
			 i++;
		 }
	 }
	 public static void recyclegWaste2() {
		 person p2=new person();
		 p2=null;
		 //通知垃圾回收器进行强制回收垃圾                                 
		 System.gc();
		 int i=1;
		 while(i<10) {
			 System.out.println("方法2循环中..");
			 i++;
		 }
	 }
	public static void main(String[] args) {
		//分别调用两个模拟演示垃圾回收的方法
		recyclegWastel();
		System.out.println("========");
		recyclegWaste2();
	}
}
