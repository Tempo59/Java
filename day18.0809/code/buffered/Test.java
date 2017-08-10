package buffered;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("folder\\a.txt");
		BufferedOutputStream bos = null;
		
//		FileReader fr = new FileReader(file);
//		System.out.println(fr.read());
//		
//		bos = new BufferedOutputStream(
//				new FileOutputStream(file));
		
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file,true));
			String s = "hello world";
			byte[] b = s.getBytes();
			bos.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bos!=null) {
				try {
					bos.flush();
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
