package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.nio.file.FileAlreadyExistsException;

public class E06 {
	public static void main(String[] args) {
		File file=new File("E:\\proj_1张晓珣18软件一班\\proj_2\\src\\proj_2");
		fileDir(file);
	}
public static void fileDir(File file) {
	File[]listFiles=file.listFiles();
	for(File files:listFiles) {
		if(files.isDirectory()) {
			fileDir(files);
		}
	System.out.println();
	}
}
}
