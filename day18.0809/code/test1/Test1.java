package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//�Ƚ�properties�ļ��е����ݶ�ȡ����
		Properties p = new Properties();
		p.load(new FileInputStream("folder\\Info.properties"));
		System.out.println(p.size());
		//ע��
		Scanner input = new Scanner(System.in);
		System.out.println("�������û���");
		String name = input.next();
		if(p.containsKey(name)){
			System.out.println("�û���̫������");
		}else {
			System.out.println("��������");
			String pwd = input.next();
			//�Ƚ���ע����û���ӵ�����
			p.put(name, pwd);
		}
		System.out.println(p.size());
		p.store(new FileOutputStream("folder\\Info.properties"), "");
		
	}

}
