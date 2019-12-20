package com.String;

import java.util.Properties;
import java.util.Set;

public class E09 {
	public static void main(String[] args) {
		Properties xtsx=System.getProperties();
		Set<String>sxm=xtsx.stringPropertyNames();
		for (String key :sxm) {
			String value=System.getProperty(key);
			System.out.println(key+"--->"+value);
		}
		}
}
