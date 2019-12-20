package com.Net.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadTCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket fwqtjz = new ServerSocket(8899);
		while (true) {
		// 通过服务器套接字获取客户端套接字
			Socket khdtjz = fwqtjz.accept();
			new Thread(() -> {
				try {// 获取客户端的端口号
					int port = khdtjz.getPort();
					String  ip=khdtjz.getInetAddress().getHostAddress();
					System.out.println("与端口号为" + port + "的客户端连接成功");
					
					File khdscdwj=new File("d:\\upload", ip+".jpg");
					FileOutputStream fout=new FileOutputStream(khdscdwj);
					//获取客户端输入流，接收文件
					InputStream is=khdtjz.getInputStream();
					byte[] zjhc=new byte[1024];
					int b=is.read(zjhc);
					while(b!=-1) {
						//写到文件;
						fout.write(zjhc,0,b);
						b=is.read(zjhc);
					}
					// 要往客户端发送数据，必须通过所获得的客户端套接字创建输出流
					OutputStream os = khdtjz.getOutputStream();
					String s = "上传成功!";
					byte[] sz = s.getBytes();
					os.write(sz);
					fout.flush();
					is.close();
					fout.close();
					os.close();
					khdtjz.close();
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}).start();
	}
	}
}



