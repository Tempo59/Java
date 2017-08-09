package DeleteEmptyDirectory;

import java.io.File;

public class Test {
	
	public static void main(String[] args) {
		File f=new File("D:\\Test");
		Tools.deteleEmptyDirectory(f);
	}

}
