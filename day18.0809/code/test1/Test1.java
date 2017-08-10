package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//先将properties文件中的数据读取出来
		Properties p = new Properties();
		p.load(new FileInputStream("folder\\Info.properties"));
		System.out.println(p.size());
		//注册
		Scanner input = new Scanner(System.in);
		System.out.println("输入新用户名");
		String name = input.next();
		if(p.containsKey(name)){
			System.out.println("用户名太抢手了");
		}else {
			System.out.println("输入密码");
			String pwd = input.next();
			//先将新注册的用户添加到集合
			p.put(name, pwd);
		}
		System.out.println(p.size());
		p.store(new FileOutputStream("folder\\Info.properties"), "");
		
	}

}
