package fileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	
	//��folder\a.txt�н����ݶ�ȡ������д�뵽folder\b.txt
	
	public static void main(String[] args) {
		
		File f1 = new File("folder\\a.txt");
		File f2 = new File("folder\\b.txt");
		
		//�߶���д
		
		//����������
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//��ʼ��
			fis = new FileInputStream(f1);
			fos = new FileOutputStream(f2);
			byte[] b = new byte[4];
			int i = -1;
			while((i=fis.read(b))!=-1) {
				fos.write(b, 0, i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) {
					fos.flush();
					fos.close();
				}
				if(fis!=null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
