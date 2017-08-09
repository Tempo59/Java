package fileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] args) {
		
		//�򹤳��е�folderĿ¼�е�
		//helloworld.txt�ļ���д��hello world
		//Ҫд���ļ�������
		String str = "hello world";
		//�����ļ�����
		File file = new File("folder\\helloworld.txt");
		//������
		FileOutputStream fos = null;
		
		try {
			//��ʼ����
			fos = new FileOutputStream(file);
			//�������ַ���ת���ֽ�����
			byte[] b = str.getBytes();
			//��b����д�뵽����
			fos.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fos!=null) {
				try {
					fos.flush();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}







