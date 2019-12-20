package com.jihe;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		Map map=new TreeMap(new CustomComparator());
		map.put("4", "Rose");
		map.put("2", "Amiee");
		map.put("1", "Jack");
		map.put("3", "Lucy");
		System.out.println(map);
		
		Set jianji=map.keySet();
		Iterator diedai=jianji.iterator();
		while(diedai.hasNext()) {
			Object key=(Object) diedai.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
