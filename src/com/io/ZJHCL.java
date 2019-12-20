package com.io;

import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ZJHCL {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:\\test.txt");
		FileWriter fw=new FileWriter("d:\\writer.txt");
		char[]buff=new char[1024];
		long kssj=System.currentTimeMillis();
		int len=fr.read(buff);
		while (len!=-1) {
			fw.write(buff,0,len);
			len=fr.read(buff);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝图片要花费的时间"+(jssj-kssj)+"毫秒");
		fr.close();
		fr.close();
	}
}
