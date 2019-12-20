package com.Thread;
	class TickeWindow extends Thread{
		private int tickets=100;
		@Override
		public void run() {
			while (true) {
				if (tickets>0) {
					System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");	
				}
			}
		}
		
	}
public class Thread_test5 {
	public static void main(String[] args) {
		new TickeWindow().start();
		new TickeWindow().start();
		new TickeWindow().start();
		new TickeWindow().start();
	}
}
