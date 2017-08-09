package PictureFileTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tools {
    //将图片f1用字节流的方式复制到f2
	public static void pictureCopyByByte(File f1,File f2) {
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
	//将f1的图片内容用字节流剪切到f2
	public static void pictureCutByByte(File f1,File f2) {
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
}
