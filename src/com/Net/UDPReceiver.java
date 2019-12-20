package com.Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import com.mysql.fabric.Server;

public class UDPReceiver {
	public static void main(String[] args) throws Exception {
		//定义一个端口号为8900的发送端DatagramSocket对象
		DatagramSocket server=new DatagramSocket(8900);
		//定义一个长度为1024的字节数组，用于接收数据
		byte[] buf=new byte[1024];
		//定义一个DatagramPacket数据报对象，封装发送端信息以及发送地址
		DatagramPacket packet=new DatagramPacket(buf,buf.length);
		System.out.println("等待接收数据...");
		while(true) {
			//等待接收数据报数据，在没有接收到数据之前处于阻塞状态
			server.receive(packet);
			//调用DatagramPacket的方法获得接收到的信息，并转换为字符串形式
			String str=new String(packet.getData());
			System.out.println(packet.getAddress().getHostAddress()+":"+str);
		}
	}
}

