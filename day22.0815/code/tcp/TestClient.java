package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	
	//客户端
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//创建服务
		Socket socket = new Socket(
				InetAddress.getByName("localhost"), 
				9090);
		//准备传输的数据
		String str = "hello world";
		byte[] b1 = str.getBytes();
		//获取流对象
		OutputStream out = socket.getOutputStream();
		//发送数据
		out.write(b1);
		
		//接收响应数据
		InputStream in = socket.getInputStream();
		//创建一个数组用来接收响应数据
		byte[] b2 = new byte[10];
		in.read(b2);
		
		//关闭服务，直接关闭服务
		socket.close();
		
		for(byte b:b2) {
			System.out.print((char)b);
		}
		
	}

}
