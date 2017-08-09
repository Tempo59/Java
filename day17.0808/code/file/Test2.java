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
		
		//删除文件
//		System.out.println(file1.delete());
		
		//获取file1对象指定的文件或目录的名称
//		System.out.println(file1.getName());
		
		//获取file1的父路径
//		System.out.println(file1.getParent());
//		System.out.println(file1.getParentFile());
//		String s = file1.getParent();
//		File f = file1.getParentFile();
//		System.out.println(s);
//		System.out.println(f);
//		
//		System.out.println(file1.getPath());
		
		
		//创建一个空文件
//		System.out.println(file1.createNewFile());
		//创建空文件夹
//		System.out.println(file1.mkdirs());
		
		//判断file1对象是否是目录
//		System.out.println(file.isDirectory());
		
//		System.out.println(file.equals(file1));
//		System.out.println(file.compareTo(file1));
		//判断文件在磁盘是否存在
//		System.out.println(file.exists());
//		System.out.println(file1.exists());
//		System.out.println(file);
//		System.out.println(file.canExecute());
//		System.out.println(file.canWrite());
//		System.out.println(file.isHidden());
	}

}
