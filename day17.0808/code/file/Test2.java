package file;

import java.io.File;
import java.io.IOException;

public class Test2 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\hello.txt");
		File file1 = new File("d:\\HELLOworld\\a");
		
		File[] fs = file1.listFiles();
		System.out.println(fs.length);
		for(File f:fs) {
			System.out.println(f);
		}
//		String[] s = file1.list();
////		System.out.println(s.length);
//		for(String ss:s) {
//			System.out.println(ss);
//		}
		
		//ɾ���ļ�
//		System.out.println(file1.delete());
		
		//��ȡfile1����ָ�����ļ���Ŀ¼������
//		System.out.println(file1.getName());
		
		//��ȡfile1�ĸ�·��
//		System.out.println(file1.getParent());
//		System.out.println(file1.getParentFile());
//		String s = file1.getParent();
//		File f = file1.getParentFile();
//		System.out.println(s);
//		System.out.println(f);
//		
//		System.out.println(file1.getPath());
		
		
		//����һ�����ļ�
//		System.out.println(file1.createNewFile());
		//�������ļ���
//		System.out.println(file1.mkdirs());
		
		//�ж�file1�����Ƿ���Ŀ¼
//		System.out.println(file.isDirectory());
		
//		System.out.println(file.equals(file1));
//		System.out.println(file.compareTo(file1));
		//�ж��ļ��ڴ����Ƿ����
//		System.out.println(file.exists());
//		System.out.println(file1.exists());
//		System.out.println(file);
//		System.out.println(file.canExecute());
//		System.out.println(file.canWrite());
//		System.out.println(file.isHidden());
	}

}
