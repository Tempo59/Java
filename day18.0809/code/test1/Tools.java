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
			System.out.println("������ѡ��\n1.��½\n2ע��");
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
			System.out.println("û���û�������ע��");
			return;
		}
		Set<User> set = readFile();
		System.out.println("�������û���");
		String name = input.next();
		User u = new User(name);
		if(set.contains(u)) {
			System.out.println("����������");
			String pwd = input.next();
			for(User uu:set) {
				if(uu.getName().equals(name)) {
					u.setPwd(uu.getPwd());
				}
			}
			if(u.getPwd().equals(pwd)) {
				System.out.println("��½�ɹ�");
			}else {
				System.out.println("�������");
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
			//����ļ����Ȳ�Ϊ0������ļ�
			Set<User> s = readFile();
			//���������û���������
			check(s);
		}
	}

	private static void check(Set<User> s) {
		System.out.println("�������µ��û���");
		String name = input.next();
		//contains
		User u = new User(name);
		if(s.contains(u)) {
			System.out.println("����û���̫������");
		}else {
			System.out.println("����������");
			String pwd = input.next();
			u.setPwd(pwd);
			s.add(u);
			writeFile(s);
			System.out.println("ע��ɹ�");
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





