package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestReceive {
	
	public static void main(String[] args) throws IOException {
		
		//��������
		DatagramSocket socket = new DatagramSocket(9090);
		
		//����byte���飬�����洢���յ�������
		byte[] b = new byte[20];
		//�������ݰ�������������
		DatagramPacket dp = new DatagramPacket(b, b.length);
		
		//��������
		socket.receive(dp);//�����Է���
		
		//�رշ���
		socket.close();
		
		//��������鿴���ܵ�����
		for(byte a:b) {
			System.out.print((char)a);
		}
		
	}

}
