package com.Thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test17 {
	
	public  synchronized static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//创建第一个线程，执行1到5相加运算;
		CompletableFuture<Integer>completableFuture1=
				CompletableFuture.supplyAsync(()->{
					int sum=0,i=0;
					while(i++<5) {
						sum+=i;
			System.out.println(Thread.currentThread().getName()+"线程任务正在执行...i:"+i);
					}
					return sum;
				});
		
		//创建第二个线程，执行6到10相加运算;
		CompletableFuture<Integer>completableFuture2=
				CompletableFuture.supplyAsync(()->{
					int sum=0,j=5;
					while(j++<10) {
						sum+=j;
			System.out.println(Thread.currentThread().getName()+"线程任务正在执行...j:"+j);
					}
					return sum;
				});
		
		//将两个线程执行结果进行获取整合;
		CompletableFuture<Integer>completableFuture3=
				completableFuture1.thenCombine(completableFuture2,
					(result1,result2)->result1+result2);
		System.out.println("1到10相加的结果为:"+completableFuture3.get());
	}
}
