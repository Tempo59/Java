package tcpImage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	
	//服务器：
	//先接收数据（读取），再将接收到的数据写入磁盘
	public static void main(String[] args) {
		
		InputStream in = null;
		OutputStream out = null;
		ServerSocket server = null;
		File file = new File("server\\a.jpg");
		
		try {
			server = new ServerSocket(9090);
			Socket socket = server.accept();
			in = socket.getInputStream();
			out = new BufferedOutputStream(
					new FileOutputStream(file));
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
				if(out!=null) {
					out.flush();
					out.close();
				}
				if(server!=null) {
					server.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}




