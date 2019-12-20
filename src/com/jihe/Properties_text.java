package com.jihe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_text {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties sxj=new Properties();
		sxj.load(new FileInputStream("d:\\test.properties"));
		sxj.forEach((key,value)->System.out.println(key+":"+value));
		
		FileOutputStream out=new FileOutputStream("d:\\test.properties");
		sxj.setProperty("charset","UTF-8");
		sxj.store(out,"新增charset编码");
	}
}
