package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class TestServer {
	
	//������
	public static void main(String[] args) throws IOException {
		
		//����ServerSocket����
		ServerSocket server = new ServerSocket(9090);
		//��ȡSocket����
		Socket socket = server.accept();//�����Է���
		//��������
		InputStream in = socket.getInputStream();
		//��ȡ����
		byte[] b1 = new byte[1024];
		in.read(b1);
		//��Ӧ����
		String str = "Hi";
		byte[] b2 = str.getBytes();
		//��ȡ��
		OutputStream out = socket.getOutputStream();
		//��b2����д����
		out.write(b2);
		
		//�رշ���
		server.close();
		
		//��������
		for(byte b:b1) {
			System.out.print((char)b);
		}
		
	}

}
