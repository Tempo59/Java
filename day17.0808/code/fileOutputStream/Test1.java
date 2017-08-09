package fileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] args) {
		
		//向工程中的folder目录中的
		//helloworld.txt文件中写入hello world
		//要写入文件的数据
		String str = "hello world";
		//创建文件对象
		File file = new File("folder\\helloworld.txt");
		//声明流
		FileOutputStream fos = null;
		
		try {
			//初始化流
			fos = new FileOutputStream(file);
			//将数据字符串转成字节数组
			byte[] b = str.getBytes();
			//将b数组写入到流中
			fos.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fos!=null) {
				try {
					fos.flush();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}







