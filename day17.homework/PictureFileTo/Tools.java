package PictureFileTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tools {
    //��ͼƬf1���ֽ����ķ�ʽ���Ƶ�f2
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
	//��f1��ͼƬ�������ֽ������е�f2
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
