package com.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class E38 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("周","张","赵","王");
	//使用单列结合的parallelStream方法创建并行流
		Stream<String> liu1=list.parallelStream();
		if(liu1.isParallel()) {
			System.out.println("liu1是一个并行流");
		}
		//使用单列集合的stream方法创建传串行流
		Stream<String> liu2=list.stream();
		if(!liu2.isParallel()) {
			System.out.println("liu2是一个串行流");
		
	}
}
}
