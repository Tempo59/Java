package fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		
		File file = new File("folder\\���.txt");
		
		//����
		FileWriter fw = null;
		
		try {
			//��ʼ��
			fw = new FileWriter(file);
			fw.write("�������");
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





