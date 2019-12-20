package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E15 {
	public static void main(String[] args) {
		//左边的类或接口必须比右边的类大或者相等
		Map<String,String> map=new LinkedHashMap<String,String>();
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
		
		System.out.println("键值对输出");
			Set jianzhidui=map.entrySet();
			Iterator diedai2=jianzhidui.iterator();
			while(diedai2.hasNext()) {
				Map.Entry key_value=(Map.Entry)diedai2.next();
				Object key1=key_value.getKey();
				Object value1=key_value.getValue();
				System.out.println(key1+":"+value1);
		}
			
			System.out.println("foreach遍历集合输出");
		//等价于第29-35行代码
			map.forEach((key,value)->System.out.println(key+";"+value));
			
			System.out.println("foreach遍历集合输出");
			Collection zhiji=map.values();
			zhiji.forEach(zhi->System.out.println(zhi));
	}
}

