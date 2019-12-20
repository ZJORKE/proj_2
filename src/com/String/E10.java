package com.String;

public class E10 {
	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		int sum=0;
		for(long i=0;i<10000000000l;i++) {
		sum+=i;
		}
		long jssj=System.currentTimeMillis();
		System.out.println("从1到1百亿耗时"+(jssj-kssj)+"毫秒");
		}
	}

