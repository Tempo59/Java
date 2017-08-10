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
	//�洢�û�����������ļ�
	private static File user = new File("userPro.properties");
	//�洢ÿ���û�������Ϣ���ļ���
	private static File file = new File("Info");
	
	//��̬����飬����ʼ���Ĺ���
	static {
		//�ж��û���������Ϣ���ļ��Ƿ���ڣ��������ڴ���һ���µĿ��ļ�
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
	//��ʼ����ķ���
	public static void enter() throws FileNotFoundException, IOException {
		System.out.println("��ӭʹ��qq");
		while(true){
			System.out.println("��ѡ�����\n1���������û�\t2�����������û�\t3���˳�");
			int choose = sc.nextInt();
			switch(choose){
			case 1:
				//�������û�����
				createNewUser();
				break;
			case 2:
				//��½����
				login();
				break;
			case 3:
				return;
			default:
				System.out.println("������������������");
			}
		}
	}
	//�������û�����
	private static void createNewUser() throws FileNotFoundException, IOException {
		//�ȴ���һ���յļ�ֵ�Լ���
		Properties userPro = new Properties();
		//��userPro.properties�ļ��е����ݼ��ص�userPro������
		userPro.load(new FileInputStream(user));
		String id = null;
		//ѭ�����������û����Ѵ���ʱ��������
		while(true){
			System.out.println("�������û���");
			id = sc.next();
			if(userPro.containsKey(id)){
				System.out.println("�û����Ѿ���ռ�ã�����������");
			}else{
				break;
			}
		}
		System.out.println("����������");
		String pwd = sc.next();
		//����������û��������Ӧ��������ӵ�userPro��
		//setProperty�����൱��put����
		userPro.setProperty(id, pwd);
		userPro.store(new FileOutputStream(user), "User_Name-Password");
	}
	//��½����
	private static void login() throws FileNotFoundException, IOException {
		//���ļ��еļ�ֵ�Լ��ص�������
		Properties userPro = new Properties();
		userPro.load(new FileInputStream(user));
		//���������û��Ԫ�أ���ʾû���û���ע��
		if(userPro.isEmpty()){
			System.out.println("û���û�������ע��");
			return;
		}
		//��½�����û���������
		while(true){
			System.out.println("�������û���");
			String id = sc.next();
			if(userPro.containsKey(id)){
				for(int i=1; i<=3; i++){
					System.out.println("����������");
					String pwd = sc.next();
					if(userPro.getProperty(id).equals(pwd)){
						System.out.println("��½�ɹ�");
						//����Ҫʹ��QQ��Ķ��������Ӧ����ɾ�Ĳ鷽��
						//ÿ���û��Լ��ĺ�����Ϣ�洢��ר�����ļ���
						//�����ڴ˴�������������û��������봴����һ��QQ����
						QQ qq = new QQ(id, pwd);
						//��qq������Ϊ�����������������ķ�����
						//operator�����ǶԵ�ǰ��½���û��ĺ��ѵ���ɾ�Ĳ����ѡ��
						operate(qq);
						return;
					}else{
						if(i==3){
							System.out.println("�������");
							return;
						}else{
							System.out.println("��������������");
						}
					}
				}
			}else{
				System.out.println("�û�����������������");
			}
		}
	}
	//��½�ɹ���Ե�ǰ��½�˺���ɾ�Ĳ���߼�����
	private static void operate(QQ qq) {
		//ÿ���û��ĺ�����Ϣ�洢���ļ������û��������룩������
		File f = new File(file,qq.getId()+".txt");
		while(true){
			System.out.println("��ѡ�����");
			System.out.println("1����Ӻ���\n2��������ɾ������\n3�����������Һ���\n4�����Һ���\n5���˳���¼");
			int choose = sc.nextInt();
			switch(choose){
			case 1:
				//����һ���µ�QQFriend����
				QQFriend friend = creatNewFriend();
//				System.out.println(friend);
				qq.addFriend(f, friend);
				break;
			case 2:
				System.out.println("������Ҫɾ�����ѵ�����");
				String name = sc.next();
				qq.deleteFriend(f, name);
				break;
			case 3:
				System.out.println("������Ҫ��ѯ�ĺ��ѵ�����");
				String name1 = sc.next();
				List<QQFriend> list = qq.queryFriend(f, name1);
				if(list.isEmpty()){
					System.out.println("δ����������");
					continue;
				}
				show(list);
				break;
			case 4:
				List<QQFriend> l = qq.queryFriend(f);
				if(l.isEmpty()){
					System.out.println("û�к��ѣ������");
					continue;
				}
				show(l);
				break;
			case 5:
				return;
			default:
				System.out.println("������������������");
				break;
			}
		}
	}
	//��������
	private static void show(List<QQFriend> list) {
		Iterator<QQFriend> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	//����һ���µ�QQFriend����
	private static QQFriend creatNewFriend() {
		System.out.println("�������º��ѵ���Ϣ��");
		System.out.println("QQ��");
		String id = sc.next();
		System.out.println("����");
		String name = sc.next();
		System.out.println("�Ա�");
		char sex = sc.next().charAt(0);
		System.out.println("����");
		int age = sc.nextInt();
		System.out.println("������ע��Ϣ");
		String say = sc.next();
		return new QQFriend(id, name, sex, age, say);
	}
	//����ļ��Ƿ���ڣ�����ļ����Ƿ�������
	public static void check(File f) {
		//���ļ������ھʹ���һ���������ļ���д��һ���յļ��϶���
		//�Ա�����Ķ�ȡ�����׳�EOFException
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
	//�ر�������
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
