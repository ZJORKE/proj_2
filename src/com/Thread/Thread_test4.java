package com.Thread;
class TickeTwindow2  implements Runnable{
	private int xuexibeiji=80;
	public void run() {
		while (true) {
			if (xuexibeiji>0) {
				System.out.println(Thread.currentThread().getName()+"正在分发"+xuexibeiji--+"笔记");
				
			}
		}
		
	}
}
public class Thread_test4 {
	public static void main(String[] args) {
	TickeTwindow2 tw=new TickeTwindow2();
	new Thread(tw,"第1位老师").start();
	new Thread(tw,"第2位老师").start();
	new Thread(tw,"第3位老师").start();
}
}
