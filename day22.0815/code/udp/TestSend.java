package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TestSend {
	
	public static void main(String[] args) throws IOException {
		
		//��������
		DatagramSocket socket = new DatagramSocket();
		
		//׼������
		String str = "hello world";
		byte[] b = str.getBytes();
		
		//�����ݴ��������DatagramPacket����
		DatagramPacket dp = new DatagramPacket(
				b, b.length, 
				InetAddress.getByName("10.7.189.75"), 
				9090);
		
		//��������
		socket.send(dp);
		
		//�رշ��񣨹ر��׽��֣�
		socket.close();
		
	}

}







