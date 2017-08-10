package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		
		File file = new File("stuInfo.txt");
		//创建三个学生对象
		Student s1 = new Student("长大", 12, 'd', 123);
		Student s2 = new Student("张二", 12, 'd', 123);
		Student s3 = new Student("张三", 12, 'd', 123);
		Student[] s = {s1,s2,s3};
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			for(int i=0; i<s.length; i++) {
				bw.write(s[i].toString());
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bw!=null) {
				try {
					bw.flush();
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String str = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
