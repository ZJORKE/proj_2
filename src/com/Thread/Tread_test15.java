package com.Thread;

import java.util.ArrayList;
import java.util.List;

public class Tread_test15 {
	public static void main(String[] args) {
		List<Object>goods=new ArrayList<>();
		long start=System.currentTimeMillis();
		Thread thread1=new Thread(()-> {
			int num=0;
			while(System.currentTimeMillis()-start<=100) {
				synchronized(goods) {
					if(goods.size()>0) {
						try {
							goods.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}else {
						goods.add("商品"+ ++ num);
						System.out.println("生产商品"+num);
					}
				}
			}
		},"生产者");
		Thread thread2=new Thread(()-> {
			int num=0;
			while(System.currentTimeMillis()-start<=100) {
				synchronized(goods) {
					if(goods.size()<=0) {
							goods.notify();
					}else {
						goods.remove("商品"+ ++ num);
						System.out.println("生产商品"+num);
					}
					}
			}
		},"消费者");
		
		thread1.start();
		thread2.start();
	}
}
