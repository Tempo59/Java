package file;

import java.io.File;
import java.io.IOException;

public class Test3 {
	
	public static void main(String[] args) throws IOException {
		
//		File file = new File("D:\\hello.txt");
//		File f = new File("D:\\helloworld\\a.txt");
//		
//		boolean b = file.renameTo(f);
//		System.out.println(b);
		
//		����������D:\\hello\\a.txt�Ѵ���
//		��a.txt��ͬĿ¼�д�����һ���µ��ļ���world
//		D:\\hello\\world����
//		����world�ļ��д���һ��hello.txt�ļ�
		
		File f1 = new File("d:\\hello\\a.txt");
		File f2 = f1.getParentFile();//��ȡf1����ĸ�·��
		File f3 = new File(f2, "world");//����D:\\hello\\worldĿ¼��File����
		f3.mkdirs();//����f3����ʾ��Ŀ¼
		File f4 = new File(f3, "hello.txt");//����D:\\hello\\world\\hello.txt��File����
		f4.createNewFile();
		
		
		
		
		
//		String s = f1.getParent();
//		File f2 = new File(s+"\\world");
//		System.out.println(f2.mkdirs());
//		File f3 = new File(f2, "hello.txt");
//		f3.createNewFile();
		
	}

}



