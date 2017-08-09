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
		
//		案例：现有D:\\hello\\a.txt已存在
//		在a.txt相同目录中创建出一个新的文件夹world
//		D:\\hello\\world存在
//		再在world文件中创建一个hello.txt文件
		
		File f1 = new File("d:\\hello\\a.txt");
		File f2 = f1.getParentFile();//获取f1对象的父路径
		File f3 = new File(f2, "world");//创建D:\\hello\\world目录的File对象
		f3.mkdirs();//创建f3所表示的目录
		File f4 = new File(f3, "hello.txt");//创建D:\\hello\\world\\hello.txt的File对象
		f4.createNewFile();
		
		
		
		
		
//		String s = f1.getParent();
//		File f2 = new File(s+"\\world");
//		System.out.println(f2.mkdirs());
//		File f3 = new File(f2, "hello.txt");
//		f3.createNewFile();
		
	}

}



