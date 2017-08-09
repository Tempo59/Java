package fileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
	
	public static void main(String[] args) {
		
		//��һ��ָ���ļ���д������
		//�����ļ����󣨱������ļ���
		File file = new File("src\\fileOutputStream\\hello.txt");
		//�ж�file�Ƿ����
//		System.out.println(file.exists());
		//����������
		FileOutputStream fos = null;
		try {
			//����������
			fos = new FileOutputStream(file,true);
			//ʹ��д��һ���ֽڵķ������ļ���д������
			fos.write(97);
			fos.write(98);
			fos.write(99);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) {
					//ˢ�¹ر���
					fos.flush();
					fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}






