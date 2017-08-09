package fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] args) {
		
		//ȷ����ȡ���ļ�
		File file = new File("folder\\helloworld.txt");
//		System.out.println(file.exists());
		
		//������
		FileInputStream fis = null;
		try {
			//��ʼ����
			fis = new FileInputStream(file);
			//����ʹ��û�в�����read����---һ�ζ���һ���ֽ�
			//����ȷѭ��������ʹ��whileѭ��
			//����һ�����α�������ʾread�����ķ���ֵ
			int i = -1;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
//			for(int i=0; i<11; i++) {
//				System.out.print((char)fis.read());
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
