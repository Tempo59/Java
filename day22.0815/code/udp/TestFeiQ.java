package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TestFeiQ {
	
	public static String fun(String masage) {
		StringBuffer sb = new StringBuffer();
		sb.append(1.0+":");
		sb.append(System.currentTimeMillis()+":");
		sb.append("牛魔王:");
		sb.append("10.1.1.1:");
		sb.append(32+":");
		sb.append(masage);
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		
		//创建协议
		DatagramSocket socke = new DatagramSocket();
		
		//数据
		String str = fun("你好，我是李雷");
		byte[] b = str.getBytes();
		
		DatagramPacket dp = new DatagramPacket(
				b, b.length, 
				InetAddress.getByName("10.7.189.116"), 
				2425);
		
		socke.send(dp);
		
		socke.close();
		
	}

}
