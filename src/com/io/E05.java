package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E05 {
	public static void main(String[] args) throws IOException {
		File file=new File("d:\\example.txt");
		BufferedWriter bWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		bWriter.write("村上春树");
		bWriter.flush();
		bWriter.close();

		System.out.println("文件名称"+file.getName());
		System.out.println("文件的相对路径"+file.getPath());
		System.out.println("文件的绝对路径"+file.getAbsolutePath());
		System.out.println("文件的父路径"+file.getParent());
	
		System.out.println(file.canRead()?"文件可读":"文件不可读");
		System.out.println(file.canWrite()?"文件可写":"文件不可写");
		System.out.println(file.isFile()?"是一个文件":"不是一个文件");
		System.out.println(file.isDirectory()?"是一个目录":"不是一个目录");
		System.out.println(file.isAbsolute()?"是绝对路径":"不是绝对路径");
		
		long z=file.lastModified();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		
		System.out.println("最后修改时间为"+sdf.format(new Date(z)));
		System.out.println("文件大小为"+file.length()+"bytes");
		System.out.println("是否成功删除文件"+file.delete());
		
		}
	}
