package DoubleTxtFileTo;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f1=new File("day17homework\\DoubleTxtFileTo\\a.txt");
		File f2=new File("day17homework\\DoubleTxtFileTo\\b.txt");
		Tools.txtCopyByByte(f1, f2);
	}
}
