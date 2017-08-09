package fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
	
	public static void main(String[] args) {
		
		File file = new File("folder\\helloworld.txt");
		
		//������
		FileInputStream fis = null;
		
		try {
			//��ʼ����
			fis = new FileInputStream(file);
			//����һ�����飬�����洢ÿ�ζ�ȡ�����������ֽ�
			byte[] b = new byte[10];
			//����һ����������,��ʾread�����ķ���ֵ
			int i = -1;
			int count = 0;
			while((i=fis.read(b))!=-1) {
				//����read��������ȡ���������ݴ洢��b������
				//��ѭ��Ϊ�˲鿴ÿһ��read������ȡ���������ݣ��������飩
				for(int j=0; j<i; j++) {
					System.out.print((char)b[j]);
				}
				System.out.println();
				count++;
			}
//			System.out.println(count);
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



