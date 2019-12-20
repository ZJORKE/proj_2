package com.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockThread implements Runnable{
		private int tickets=10;
	private final Lock lock=new ReentrantLock();
		public void run() {
			while(true) {
				lock.lock();
	if(tickets>0) {
		try {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}
			}
		}
	}
public class Thread_test13 {
	public static void main(String[] args) {
		LockThread lockThread=new LockThread();
	new Thread(lockThread,"窗口 1").start();
	new Thread(lockThread,"窗口 2").start();
	new Thread(lockThread,"窗口 3").start();
	new Thread(lockThread,"窗口 4").start();
}
}