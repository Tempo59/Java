package DeleteEmptyDirectory;

import java.io.File;

public class TestMyThinking {
    //����true,��Ŀ¼Ҳ��һ��Ŀ¼
	public static void main(String[] args) {
		File f=new File("D:\\Test");
		System.out.println(f.isDirectory());
		File[] arr=f.listFiles();
		System.out.println(arr[0]);
	}
}
