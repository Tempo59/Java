package DeleteEmptyDirectory;

import java.io.File;

public class Tools {
    //ɾ���ǿ��ļ���,String�᷵�ؿգ�
	public static void deteleEmptyDirectory(File f) {
		File[] file=f.listFiles();
		if(file!=null) {
			System.out.println(1);
			for(int i=0;i<file.length;i++) {
				if(file[i].isDirectory()) {
				deteleEmptyDirectory(file[i]);
				}else {
					file[i].delete();
				}
			}
		}
			f.delete();
		    
		
	}
}
