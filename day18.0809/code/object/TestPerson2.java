package object;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestPerson2 {
	
	public static void main(String[] args) {
		
		File file = new File("folder\\per.txt");
		
		//向file文件中序列化3个Person对象
		//可以多次调用writeObject方法
		Person p1 = new Person("唐僧", 12);
		Person p2 = new Person("白骨精", 122);
		Person p3 = new Person("狐狸精", 111);
		
		Person[] ps = {p1,p2,p3};
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(
					new FileOutputStream(file));
			
			oos.writeObject(ps);
//			oos.writeObject(p2);
//			oos.writeObject(p3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(oos!=null) {
				try {
					oos.flush();
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
