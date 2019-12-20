package com.Thread;

import org.apache.poi.hssf.record.cf.IconMultiStateFormatting;

class EmergencyThread implements Runnable{
		public void run() {
			for (int i = 0; i <6; i++) {
				System.out.println(Thread.currentThread().getName()+"输入:"+i);
		}
	}
	}
public class Thread_test10 {
	public static void main(String[] args) throws Exception {
		Thread thread1=new Thread(new EmergencyThread(),"thread1");
		thread1.start();
		for (int i=1;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"输入:"+i);
			if(i==2) {
				thread1.join();
			}
		}
	}
}
