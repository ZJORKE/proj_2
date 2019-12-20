package com.Net.Chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable  {
	private DatagramSocket server;
	public ChatReceiver(DatagramSocket server) {
		this.server=server;
	}

	@Override
	public void run() {
		try {
			byte[] buf=new byte[1024];
			DatagramPacket packet=new DatagramPacket(buf,buf.length);
			while(true) {
				server.receive(packet);
				String str=new String(packet.getData(),
						0,packet.getLength(),"UTF-8");
				System.out.println("收到来自"+packet.getAddress()+"的信息:"+packet.getPort()+"发送数据:"+str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
