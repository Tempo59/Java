package PictureFileTo;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f1=new File("day17homework\\pictureFileTo\\a.png");
		File f2=new File("day17homework\\pictureFileTo\\b.png");
		Tools.pictureCopyByByte(f1, f2);
	}
}
