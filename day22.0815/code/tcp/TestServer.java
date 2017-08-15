package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class TestServer {
	
	//服务器
	public static void main(String[] args) throws IOException {
		
		//创建ServerSocket对象
		ServerSocket server = new ServerSocket(9090);
		//获取Socket对象
		Socket socket = server.accept();//阻塞性方法
		//接收数据
		InputStream in = socket.getInputStream();
		//读取数据
		byte[] b1 = new byte[1024];
		in.read(b1);
		//响应数据
		String str = "Hi";
		byte[] b2 = str.getBytes();
		//获取流
		OutputStream out = socket.getOutputStream();
		//将b2数组写入流
		out.write(b2);
		
		//关闭服务
		server.close();
		
		//遍历数组
		for(byte b:b1) {
			System.out.print((char)b);
		}
		
	}

}
