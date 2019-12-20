package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread6 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run方法在运行");
		}
		return i;
	}
	
}
public class Thread_test16 {
	public static void main(String[] args) throws Exception,ExecutionException{
		//创建Callable接口的实现类
		MyThread6 myThread6=new MyThread6();
		//使用Excutors线程执行器类创建可扩展的线程池
		ExecutorService executor=Executors.newCachedThreadPool();
		
		//将Callable接口实现类的对象提交到线程池进行管理;
		Future<Object> rusult1=executor.submit(myThread6);
		Future<Object> rusult2=executor.submit(myThread6);
		//关闭线程池
		executor.shutdown();
		System.out.println("thread-1返回结果"+rusult1.get());
		System.out.println("thread-2返回结果"+rusult2.get());
	}
}
