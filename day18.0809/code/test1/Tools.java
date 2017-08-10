package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tools {
	
	public static void main(String[] args) {
		
		start();
		
	}
	
	public static void start() {
		while(true) {
			System.out.println("请输入选择\n1.登陆\n2注册");
			int choose = input.nextInt();
			switch(choose) {
			case 1:
				login();
				break;
			case 2:
				regis();
				break;
			default :
				return;
			}
		}
	}
	
	private static void login() {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(file.length()==0) {
			System.out.println("没有用户，请先注册");
			return;
		}
		Set<User> set = readFile();
		System.out.println("请输入用户名");
		String name = input.next();
		User u = new User(name);
		if(set.contains(u)) {
			System.out.println("请输入密码");
			String pwd = input.next();
			for(User uu:set) {
				if(uu.getName().equals(name)) {
					u.setPwd(uu.getPwd());
				}
			}
			if(u.getPwd().equals(pwd)) {
				System.out.println("登陆成功");
			}else {
				System.out.println("密码错误");
			}
			
		}
	}

	final static Scanner input = new Scanner(System.in);
	
	final static File file = new File("folder\\userInfo.txt");
	
	public static void regis() {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(file.length()==0) {
			Set<User> s = new HashSet<>();
			check(s);
		}else {
			//如果文件长度不为0，则读文件
			Set<User> s = readFile();
			//键盘输入用户名和密码
			check(s);
		}
	}

	private static void check(Set<User> s) {
		System.out.println("请输入新的用户名");
		String name = input.next();
		//contains
		User u = new User(name);
		if(s.contains(u)) {
			System.out.println("这个用户名太抢手了");
		}else {
			System.out.println("请输入密码");
			String pwd = input.next();
			u.setPwd(pwd);
			s.add(u);
			writeFile(s);
			System.out.println("注册成功");
		}
	}

	private static void writeFile(Set<User> s) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(
					new FileOutputStream(file));
			oos.writeObject(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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

	private static Set<User> readFile() {
		Set<User> set = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(
					new FileInputStream(file));
			set = (Set<User>) ois.readObject();
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
		return set;
	}

}





