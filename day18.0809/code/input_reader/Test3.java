package input_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test3 {
	
	public static void main(String[] args) {
		
		File file = new File("folder\\hello.txt");
		
		OutputStreamWriter osw = null;
		
		try {
			osw = new OutputStreamWriter(new FileOutputStream(file),"utf-8");
			
			osw.write("你好世界 我是韩梅梅");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(osw!=null) {
				try {
					osw.flush();
					osw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
