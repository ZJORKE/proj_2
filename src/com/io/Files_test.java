package com.io;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
	//创建目录
		Path ml=Paths.get("d:/test/sample");
		try {
			Files.createDirectories(ml);
			System.out.println("目录创建成功");
		} catch(IOException e) {
			System.out.println("目录创建不成功");
		}
		//创建文件
		Path wj=Paths.get("d:/test/sample/test.txt");
		try {
			Files.createFile(wj);
			System.out.println("文件创建成功");
		} catch(IOException e) {
			System.out.println("文件创建不成功");
		}
		//将集合的内容写入文件
		List list=new ArrayList<>();
		list.add("这是一个测试文件");
		try {
			Files.write(wj, list, StandardOpenOption.APPEND);
			System.out.println("文件写入成功");
		}catch(IOException e) {
			System.out.println("文件写入不成功");
		}
		//读取文件
		List<String> lines=Files.readAllLines(wj);
		System.out.println("文件中的内容:"+lines);
		System.out.println("文件中的大小:"+Files.size(wj));
	}

}
