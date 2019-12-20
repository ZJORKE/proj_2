package com.Thread;
	class SaleThread implements Runnable{
	private int tickets=10;
	public void run() {
		while (true) {
			if(tickets>0) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");
		}
	}
	}
	}
public class Tread_test11 {
	public static void main(String[] args) {
		SaleThread saleThread=new SaleThread();
		new Thread(saleThread,"窗口 1").start();
		new Thread(saleThread,"窗口 2").start();
		new Thread(saleThread,"窗口 3").start();
		new Thread(saleThread,"窗口 4").start();
	}
}
