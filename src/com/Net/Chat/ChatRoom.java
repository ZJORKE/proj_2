package com.Net.Chat;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) throws Exception {
			//创建聊天程序收发平台DatagramSocket对象
			DatagramSocket sender_socket=new DatagramSocket(5000);
			DatagramSocket receiver_socket=new DatagramSocket(3000);
			//分别启动信息接收端和发送端程序
			new Thread(new ChatReceiver(receiver_socket),"接收服务").start();
			new Thread(new ChatSend(sender_socket,3000),"发送服务").start();	
		}
}