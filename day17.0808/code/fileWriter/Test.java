package fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		
		File file = new File("folder\\你好.txt");
		
		//声明
		FileWriter fw = null;
		
		try {
			//初始化
			fw = new FileWriter(file);
			fw.write("你好世界");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fw!=null) {
				try {
					fw.flush();
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}





