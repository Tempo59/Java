package fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestImage {
	
	//使用字符流复制jpg文件
	
	public static void main(String[] args) {
		
		File file = new File("folder\\a.jpg");
		File f = new File("folder\\b.jpg");
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(file);
			fw = new FileWriter(f);
			int i = -1;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null) {
					fw.flush();
					fw.close();
				}
				if(fr!=null) {
					fr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}





