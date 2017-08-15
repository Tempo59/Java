package tcpImage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TestClient {
	
	//�ͻ��ˣ�
	//��a.png�ļ������ͻ��˳����У��ٽ���������ʹ��socket�ϲ���������
	public static void main(String[] args) {
		
		InputStream in = null;
		OutputStream out = null;
		File file = new File("client\\a.jpg");
		Socket socket = null;
		
		try {
			socket = new Socket(
					InetAddress.getByName("127.0.0.1"), 
					9090);
			in = new BufferedInputStream(
					new FileInputStream(file));
			out = socket.getOutputStream();
//			byte[] b = new byte[20];
			int i = -1;
			while((i=in.read())!=-1) {
				out.write(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(socket!=null) {
					socket.close();
				}
				if(in!=null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}







