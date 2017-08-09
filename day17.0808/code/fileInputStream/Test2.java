package fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
	
	public static void main(String[] args) {
		
		File file = new File("folder\\helloworld.txt");
		
		//声明流
		FileInputStream fis = null;
		
		try {
			//初始化流
			fis = new FileInputStream(file);
			//声明一个数组，用来存储每次读取出来的数据字节
			byte[] b = new byte[10];
			//声明一个整形数据,表示read方法的返回值
			int i = -1;
			int count = 0;
			while((i=fis.read(b))!=-1) {
				//调用read方法将读取出来的数据存储到b数组中
				//此循环为了查看每一次read方法读取出来的数据（遍历数组）
				for(int j=0; j<i; j++) {
					System.out.print((char)b[j]);
				}
				System.out.println();
				count++;
			}
//			System.out.println(count);
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



