package com.jihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class E14 {
	public static void main(String[] args) {
		//左边的类或接口必须比右边的类大或者相等
		Map<String,String> map=new HashMap<String,String>();
		//map存储的元素是一个键key+值value=对象
		map.put("1", "Jack");
		map.put("3", "Rose");
		map.put("2", "Mary");
		map.put("1", "Hallen");
		System.out.println(map);
		
		if(map.containsKey("1")) {
			System.out.println("双列集合map包含键");
			System.out.println("双列集合map键的值是"+map.get("1"));
		}
		
		//通过KeySet()和values()方法获取键对相集合值对象集合
		//也就是把map这个双列集合变成单列集合set
		System.out.println("键对象集合是"+map.keySet());
		System.out.println("值对象集合是"+map.values());
		//修改集合中键为1的元素
		map.replace("1", "Mary");
		System.out.println(map);
		//删除集合中键为1的元素
		map.remove("1");
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
