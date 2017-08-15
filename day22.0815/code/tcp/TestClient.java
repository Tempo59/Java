package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	
	//�ͻ���
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//��������
		Socket socket = new Socket(
				InetAddress.getByName("localhost"), 
				9090);
		//׼�����������
		String str = "hello world";
		byte[] b1 = str.getBytes();
		//��ȡ������
		OutputStream out = socket.getOutputStream();
		//��������
		out.write(b1);
		
		//������Ӧ����
		InputStream in = socket.getInputStream();
		//����һ����������������Ӧ����
		byte[] b2 = new byte[10];
		in.read(b2);
		
		//�رշ���ֱ�ӹرշ���
		socket.close();
		
		for(byte b:b2) {
			System.out.print((char)b);
		}
		
	}

}
