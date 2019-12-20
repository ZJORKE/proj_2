package com.Net.Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSend implements Runnable {
	private DatagramSocket client;
	private int targetPort;
	public ChatSend(DatagramSocket client, int targetPort) {
		this.client=client;
		this.targetPort=targetPort;
	}
	@Override
	public void run() {
		try {
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.println("请输入要发送的消息:");
			String str=sc.nextLine();
				byte[] buf=str.getBytes("UTF-8");
				System.out.println("请输入要发送的IP地址:");
				String ip=sc.nextLine();
				DatagramPacket packet=new DatagramPacket(buf,buf.length,
						InetAddress.getByName(ip),targetPort);
				System.out.println("开始发送信息....");
				client.send(packet);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}
}

