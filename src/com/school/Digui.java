package com.school;

public class Digui {
	public static int getSum(int n) {
		if(n==1) {
	//满足条件,递归结束
			return 1;
			
	}
		int temp=getSum(n-1);
		return temp +n;
	}
	public static void main(String[] args) {
	System.out.println("1到100的和为"+getSum(100));	
	}
}
