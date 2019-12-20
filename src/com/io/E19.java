package com.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class E19 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile yswj=new RandomAccessFile("d:\\zxx.jpg","rw");
		RandomAccessFile mbwj=new RandomAccessFile("d:\\zxx.jpg","rw");
	FileChannel finc=yswj.getChannel();
	FileChannel foutc=yswj.getChannel();
	long wjdx=finc.transferTo(0, finc.size(), foutc);
	if(wjdx>0) {
		System.out.println("复制成功");
	}
		yswj.close();
		mbwj.close();
		finc.close();
		foutc.close();
	}
}
