package com.Net.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadTCPClient {

	public static void main(String[] args) throws Exception {
		//创建客户端套接字,参数是服务器的IP地址和服务器开放的端口号，连接服务器
		Socket khdtjz=new Socket("10.2.103.31", 8899);
		//客户端向服务器端传送文件
		OutputStream os = khdtjz.getOutputStream();
		
		File khdscdwj=new File("d:\\1.jpg");
		//获取文件输入流，准备发送文件
		FileInputStream fin=new FileInputStream(khdscdwj);
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
			//写到网络;
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
	}

}











