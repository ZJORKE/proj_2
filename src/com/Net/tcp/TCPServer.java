package com.Net.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket fwqtjz = new ServerSocket(8899);
		// 创建死循环，不断响应客户端的请求
		while (true) {

			// 通过服务器套接字获取客户端套接字
			Socket khdtjz = fwqtjz.accept();
			new Thread(() -> {
				try {
					// 获取客户端的ip地址
					String ip=khdtjz.getInetAddress().getHostAddress();
					// 获取客户端的端口号
					int port = khdtjz.getPort();
					System.out.println("与端口号为" + port + "的客户端连接成功");
					
					
					// 要从客户端接收文件，必须通过所获得的客户端套接字创建输入流
					InputStream is;
                    //获取字节输出流，准备往网络中写数据
					is = khdtjz.getInputStream();
                    //先准备文件
					File wj=new File("d:\\upload\\"+ip+".jpg");
					//创建文件字节输出流，用上面的文件对象作为参数
					FileOutputStream fout=new FileOutputStream(wj);
					byte[] zjhc=new byte[1024];
					int b=is.read(zjhc);
					//直到网络数据结束
					while(b!=-1) {
						//写到文件中;
						fout.write(zjhc,0,b);
						//再次网络读取信息
						b=is.read(zjhc);
					}
					// 要往客户端发送数据，必须通过所获得的客户端套接字创建输出流
					OutputStream os;
                    //获取字节输出流，准备往网络中写数据
					os = khdtjz.getOutputStream();
					String s = ip+"上传成功";
					zjhc= s.getBytes();
					os.write(zjhc);
					Thread.sleep(5000);
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
	