package com.Thread;

public class Thread_test8 {
	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出i:"+i);
			} 
		},"优先级较低的线程");
		
		Thread t2=new Thread(()->{
			for(int j=0;j<10;j++) {
				System.out.println(Thread.currentThread().getName()+"正在输出j:"+j);
			} 
		},"优先级较高的线程");
		
		Thread t3=new Thread(()->{
			for(int z=0;z<10;z++) {
				System.out.println(Thread.currentThread().getName()+"正在输出z:"+z);
			} 
		},"优先级普通的线程");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(10);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
	}
}
