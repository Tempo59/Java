package fileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
	
	public static void main(String[] args) {
		
		//向一个指定文件中写入数据
		//创建文件对象（被操作文件）
		File file = new File("src\\fileOutputStream\\hello.txt");
		//判断file是否存在
//		System.out.println(file.exists());
		//声明流对象
		FileOutputStream fos = null;
		try {
			//创建流对象
			fos = new FileOutputStream(file,true);
			//使用写入一个字节的方法向文件中写入数据
			fos.write(97);
			fos.write(98);
			fos.write(99);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) {
					//刷新关闭流
					fos.flush();
					fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}






