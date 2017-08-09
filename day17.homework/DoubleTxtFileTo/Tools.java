package DoubleTxtFileTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tools {
    //将f1文件的内容用字节流方式复制到f2
	public static void txtCopyByByte(File f1,File f2) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(f1);
			fos=new FileOutputStream(f2);
			int i=-1;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			if(fos!=null) {
				fos.flush();
				fos.close();
			}
			if(fis!=null) {
				fis.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//将f1文件内容用字符流的方式复制到f2
	public static void txtCopyByChar(File f1,File f2) {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader(f1);
			fw=new FileWriter(f2);
			int i=-1;
			while((i=fr.read())!=-1){
				fw.write(i);
			}
			if(fw!=null) {
				fw.flush();
				fw.close();
			}
			if(fr!=null) {
				fr.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	//将f1的文件内容用字节流的方式剪切到f2
	public static void txtCutByByte(File f1,File f2) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(f1);
			fos=new FileOutputStream(f2);
			int i=-1;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			if(fos!=null) {
				fos.flush();
				fos.close();
			}
			if(fis!=null) {
				fis.close();
				f1.delete();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//将f1的文本内容用字符流的方式剪切到f2
	public static void txtCutByChar(File f1,File f2) {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader(f1);
			fw=new FileWriter(f2);
			int i=-1;
			while((i=fr.read())!=-1){
				fw.write(i);
			}
			if(fw!=null) {
				fw.flush();
				fw.close();
			}
			if(fr!=null) {
				fr.close();
				f1.delete();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
