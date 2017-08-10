package object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestPerson3 {
	
	public static void main(String[] args) {
		
		File file = new File("folder\\per.txt");
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(
					new FileInputStream(file));
			
			Person[] p = (Person[]) ois.readObject();
			
			for(Person pp:p) {
				System.out.println(pp);
			}
			
//			Object o = null;
//			while((o=ois.readObject())!=null) {
//				System.out.println(o);
//			}
			
//			for(int i=0; i<=3; i++) {
//				System.out.println(ois.readObject());
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(ois!=null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}





