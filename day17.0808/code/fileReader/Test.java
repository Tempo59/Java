package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		
		File file = new File("folder\\ÄãºÃ.txt");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			char[] ch = new char[3];
			int i = -1;
			while((i=fr.read(ch))!=-1) {
				for(int j=0; j<i; j++) {
					System.out.print(ch[j]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
