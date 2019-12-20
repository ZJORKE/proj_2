package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E02 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("d:\\test.txt");
		int len=0;
		while ((len=fileReader.read()) !=-1) {
			System.out.print((char)len);
		}
		fileReader.close();
		
		FileWriter filewriter=new FileWriter("d:\\writer.txt");
		filewriter.write("卖核弹的小女孩,\r\n");
		filewriter.write("          ---安屠生童话,\r\n");
		
		filewriter.write("在一个冬夜里,\r\n");
		filewriter.write("卖核弹的小女孩一颗核弹都没卖出去,\r\n");
		filewriter.write("她实在是太冷了,\r\n");
		filewriter.write("于是她点燃了一颗核弹,\r\n");
		filewriter.write("那一晚,\r\n");
		filewriter.write("全村人都看见了她奶奶,\r\n");
		
		filewriter.close();
	}
}
