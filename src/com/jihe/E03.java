package com.jihe;

import java.util.ArrayList;
import java.util.HashSet;

public class E03 {
	public static void main(String[] args) {
		ArrayList  arrayList=new ArrayList<>();
		arrayList.add("s1");
		arrayList.add("s2");
		arrayList.add("s3");
		arrayList.add("s4");
		System.out.println(arrayList);
		
		HashSet set=new HashSet();
		set.add("s1");
		set.add("s2");
		set.add("s3");
		set.add("s4");
		System.out.println(set);
		
	set.forEach(o ->System.out.print(o));
		
	}
}
