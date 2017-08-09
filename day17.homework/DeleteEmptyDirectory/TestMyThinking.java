package DeleteEmptyDirectory;

import java.io.File;

public class TestMyThinking {
    //返回true,空目录也是一个目录
	public static void main(String[] args) {
		File f=new File("D:\\Test");
		System.out.println(f.isDirectory());
		File[] arr=f.listFiles();
		System.out.println(arr[0]);
	}
}
