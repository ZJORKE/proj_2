package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.attribute.standard.Finishings;

public class E01 {
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream=new FileInputStream("d:\\我的龙龙.jpg");
		FileOutputStream out=new FileOutputStream("d:\\dest.jpg");
		
		long kssj=System.currentTimeMillis();
		byte[] zjhc=new byte[1024];
		//定义一个int类型的变量b
		int b=0;
		//通过循环来读取文件，当返回值为-1结束循环
		
		while((b=inputStream.read(zjhc)) !=-1) {
			//System.out.println(b);
			out.write(zjhc);
		}
		
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝图片要花费的时间"+(jssj-kssj)+"毫秒");
		//关闭流
		//String string="加油鸭!龙龙";
		//out.write(string.getBytes("UTF-8"));
		inputStream.close();
		out.close();
	}
}
