package com.school;

public class F斐波那契 {
	public static int F(int n) {
		//F(1)=1   F(2)=1
		if (n==1) 
		return 1;  
		if (n==2)
	    return 1;
		//F(n)=F(n-1)+F(n-2)
		return F(n-1)+F(n-2);
		}
public static void main(String[] args) {
		System.out.println("斐波那契第个30数值是"+F(30                   ));
	}

}