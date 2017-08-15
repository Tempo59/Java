package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestReceive {
	
	public static void main(String[] args) throws IOException {
		
		//创建服务
		DatagramSocket socket = new DatagramSocket(9090);
		
		//创建byte数组，用来存储接收到的数据
		byte[] b = new byte[20];
		//创建数据包用来接收数据
		DatagramPacket dp = new DatagramPacket(b, b.length);
		
		//接收数据
		socket.receive(dp);//阻塞性方法
		
		//关闭服务
		socket.close();
		
		//遍历数组查看接受的数据
		for(byte a:b) {
			System.out.print((char)a);
		}
		
	}

}
