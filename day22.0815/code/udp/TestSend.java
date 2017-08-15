package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TestSend {
	
	public static void main(String[] args) throws IOException {
		
		//创建服务
		DatagramSocket socket = new DatagramSocket();
		
		//准备数据
		String str = "hello world";
		byte[] b = str.getBytes();
		
		//将数据打包，创建DatagramPacket对象
		DatagramPacket dp = new DatagramPacket(
				b, b.length, 
				InetAddress.getByName("10.7.189.75"), 
				9090);
		
		//发送数据
		socket.send(dp);
		
		//关闭服务（关闭套接字）
		socket.close();
		
	}

}







