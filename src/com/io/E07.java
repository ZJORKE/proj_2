package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

import javax.xml.bind.annotation.XmlSchema;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class E07 {
	 static HashMap<String,Integer> hm=new HashMap<>();
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("d:\\18rj1.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
		String xsm=br.readLine();
		while (xsm!=null) {
			hm.put(xsm,0);
			xsm=br.readLine();
		}
		File file=new File("d:\\18软件1班作业");
		fileDir(file);
		System.out.println(hm);
	}
	public static void fileDir(File file) {
		File[] listfiles=file.listFiles();
		for(File f:listfiles) {
			if(f.isDirectory()) {
				String wjm=f.getName();
				hm.forEach((xsm,cs)->{
					if(wjm.contains(xsm)) {
						cs=cs+1;
						hm.put(xsm,cs);
		}
		});
				fileDir(f);
			}
		}
		
		}
}
