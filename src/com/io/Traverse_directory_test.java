package com.io;

import java.io.File;
import java.util.Arrays;

public class Traverse_directory_test {
	public static void main(String[] args) {
		File file=new File("E:\\proj_1张晓珣18软件一班\\proj_2\\src\\proj_2");
		if(file.isDirectory()) {
			String[] fileNames=file.list((dir,name)->name.endsWith(".java"));
			Arrays.stream(fileNames).forEach(f->System.out.println(f));
		}
	}
}
