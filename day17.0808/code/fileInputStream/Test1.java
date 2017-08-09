package fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] args) {
		
		//确定读取的文件
		File file = new File("folder\\helloworld.txt");
//		System.out.println(file.exists());
		
		//声明流
		FileInputStream fis = null;
		try {
			//初始化流
			fis = new FileInputStream(file);
			//若想使用没有参数的read方法---一次读出一个字节
			//不明确循环次数，使用while循环
			//声明一个整形变量，表示read方法的返回值
			int i = -1;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
//			for(int i=0; i<11; i++) {
//				System.out.print((char)fis.read());
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
