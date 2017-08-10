package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Tools {
	
	private static Scanner sc = new Scanner(System.in);
	//存储用户名和密码的文件
	private static File user = new File("userPro.properties");
	//存储每个用户好友信息的文件夹
	private static File file = new File("Info");
	
	//静态代码块，做初始化的工作
	static {
		//判断用户名密码信息的文件是否存在，若不存在创建一个新的空文件
		if(!user.exists()){
			try {
				user.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(!file.exists()){
			file.mkdirs();
		}
	}
	//开始程序的方法
	public static void enter() throws FileNotFoundException, IOException {
		System.out.println("欢迎使用qq");
		while(true){
			System.out.println("请选择操作\n1：创建新用户\t2：操作已有用户\t3：退出");
			int choose = sc.nextInt();
			switch(choose){
			case 1:
				//创建新用户方法
				createNewUser();
				break;
			case 2:
				//登陆方法
				login();
				break;
			case 3:
				return;
			default:
				System.out.println("输入有误，请重新输入");
			}
		}
	}
	//创建新用户方法
	private static void createNewUser() throws FileNotFoundException, IOException {
		//先创建一个空的键值对集合
		Properties userPro = new Properties();
		//将userPro.properties文件中的数据加载到userPro集合中
		userPro.load(new FileInputStream(user));
		String id = null;
		//循环操作，当用户名已存在时重新输入
		while(true){
			System.out.println("请输入用户名");
			id = sc.next();
			if(userPro.containsKey(id)){
				System.out.println("用户名已经被占用，请重新输入");
			}else{
				break;
			}
		}
		System.out.println("请输入密码");
		String pwd = sc.next();
		//将新输入的用户名和相对应的密码添加到userPro中
		//setProperty方法相当于put方法
		userPro.setProperty(id, pwd);
		userPro.store(new FileOutputStream(user), "User_Name-Password");
	}
	//登陆方法
	private static void login() throws FileNotFoundException, IOException {
		//将文件中的键值对加载到集合中
		Properties userPro = new Properties();
		userPro.load(new FileInputStream(user));
		//如果集合中没有元素，提示没有用户先注册
		if(userPro.isEmpty()){
			System.out.println("没有用户，请先注册");
			return;
		}
		//登陆输入用户名和密码
		while(true){
			System.out.println("请输入用户名");
			String id = sc.next();
			if(userPro.containsKey(id)){
				for(int i=1; i<=3; i++){
					System.out.println("请输入密码");
					String pwd = sc.next();
					if(userPro.getProperty(id).equals(pwd)){
						System.out.println("登陆成功");
						//由于要使用QQ类的对象调用相应的增删改查方法
						//每个用户自己的好友信息存储在专属的文件中
						//所以在此处将键盘输入的用户名和密码创建成一个QQ对象
						QQ qq = new QQ(id, pwd);
						//将qq对象作为参数传到后续操作的方法中
						//operator方法是对当前登陆的用户的好友的增删改查操作选择
						operate(qq);
						return;
					}else{
						if(i==3){
							System.out.println("密码错误");
							return;
						}else{
							System.out.println("错误，请重新输入");
						}
					}
				}
			}else{
				System.out.println("用户名错误，请重新输入");
			}
		}
	}
	//登陆成功后对当前登陆账号增删改查的逻辑操作
	private static void operate(QQ qq) {
		//每个用户的好友信息存储的文件是以用户名（号码）命名的
		File f = new File(file,qq.getId()+".txt");
		while(true){
			System.out.println("请选择操作");
			System.out.println("1：添加好友\n2：按姓名删除好友\n3：按姓名查找好友\n4：查找好友\n5：退出登录");
			int choose = sc.nextInt();
			switch(choose){
			case 1:
				//创建一个新的QQFriend对象
				QQFriend friend = creatNewFriend();
//				System.out.println(friend);
				qq.addFriend(f, friend);
				break;
			case 2:
				System.out.println("请输入要删除好友的姓名");
				String name = sc.next();
				qq.deleteFriend(f, name);
				break;
			case 3:
				System.out.println("请输入要查询的好友的姓名");
				String name1 = sc.next();
				List<QQFriend> list = qq.queryFriend(f, name1);
				if(list.isEmpty()){
					System.out.println("未添加这个好友");
					continue;
				}
				show(list);
				break;
			case 4:
				List<QQFriend> l = qq.queryFriend(f);
				if(l.isEmpty()){
					System.out.println("没有好友，请添加");
					continue;
				}
				show(l);
				break;
			case 5:
				return;
			default:
				System.out.println("输入有误，请重新输入");
				break;
			}
		}
	}
	//遍历集合
	private static void show(List<QQFriend> list) {
		Iterator<QQFriend> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	//创建一个新的QQFriend对象
	private static QQFriend creatNewFriend() {
		System.out.println("请输入新好友的信息：");
		System.out.println("QQ号");
		String id = sc.next();
		System.out.println("姓名");
		String name = sc.next();
		System.out.println("性别");
		char sex = sc.next().charAt(0);
		System.out.println("年龄");
		int age = sc.nextInt();
		System.out.println("其他备注信息");
		String say = sc.next();
		return new QQFriend(id, name, sex, age, say);
	}
	//检查文件是否存在，检查文件中是否有数据
	public static void check(File f) {
		//若文件不存在就创建一个，并向文件中写入一个空的集合对象
		//以便后续的读取操作抛出EOFException
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ObjectOutputStream oos = null;
			try {
				oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(new ArrayList<QQFriend>());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				close(null, oos);
		}
		}
	}
	//关闭流操作
	public static void close(ObjectInputStream ois, ObjectOutputStream oos) {
		try {
			if(oos!=null){
				oos.flush();
				oos.close();
			}
			if(ois!=null){
				ois.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
