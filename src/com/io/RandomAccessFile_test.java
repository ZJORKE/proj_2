package com.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		RandomAccessFile raf=new RandomAccessFile("t.txt","rw");
		int times=Integer.parseInt(raf.readLine())-1;
		if(times>0) {
			System.out.println(" 您还可以试用"+times+"次!");
			raf.seek(0);
			raf.write((times+"").getBytes());
		}
		else {
			System.out.println("试用次数已经用完!");
		}
		raf.close();
	}
}
