package input_reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Test2 {
	
	public static void main(String[] args) {
		
		//使用转换流指定编码格式读取文件
		File file = new File("folder\\hello.txt");
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream(file), "utf-8");
			int i = -1;
			while((i=isr.read())!=-1) {
				System.out.println((char)i);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(isr!=null) {
				try {
					isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
