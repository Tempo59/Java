package w02d10homework;

import java.util.Scanner;

/**
 * ������
 * @author Administrator
 *
 */
public class Tools {

	static String name;
	static String number;
	/**
	 * ��ʼ�绰���Ĳ���
	 * 
	 * @param input
	 * @param Function
	 * @param friends
	 */
	public static void start(Scanner input,Function f,Friend[] friends) {
		
		 while(true) {
			 System.out.println("��������Ҫ���еĹ��ܣ�");
				System.out.println("\t" + "1.������ϵ��");
				System.out.println("\t" + "2.������ɾ����ϵ��");
				System.out.println("\t" + "3.����ϵ����ɾ����ϵ��");
				System.out.println("\t" + "4.�������޸���ϵ�˺���");
				System.out.println("\t" + "5.��������ѯ��ϵ��");
				System.out.println("\t" + "6.��ѯ������ϵ��");
				System.out.println("\t" + "7.�˳�ϵͳ");
				char i = input.next().charAt(0);
				
				switch (i) {
				case '1':
					addFriend(f, initFriend(input), friends);
					break;
				case '2':
					System.out.println("��������Ҫɾ����ϵ�˵�������");
					name = input.next();
					deleteFriendByName(f, name, friends);
					break;
				case '3':
					System.out.println("��������Ҫɾ����ϵ�˵ĺ��룺");
					number = input.next();
					deleteFriendByNumber(f, number, friends);
					break;
				case '4':
					System.out.println("��������Ҫ�޸���ϵ��������");
					name = input.next();
					Friend friend1 = f.searchFriend( name, friends);
					if (friend1 != null) {
						System.out.println("�������º��룺");
						number = input.next();
						setFriendByName(f, name, friends, number);
					}
					break;
				case '5':
					System.out.println("������Ҫ������ϵ�˵�������");
					searchFriend(f, input.next(), friends);
					break;
				case '6':
					searchAll(f, friends);
					break;
				case '7':
					System.out.println("�ѳɹ��˳�ϵͳ!");
					System.exit(0);
					break;
				default:
					System.out.println("����������������룡");
					break;
				}
		 }
		
	}

	/**
	 * ��ʼ��һ����ϵ��
	 * @param input
	 * @return
	 */
	public static Friend initFriend(Scanner input) {
		Friend friend = new Friend();
		System.out.println("\t"+"��������Ҫ�����ϵ�˵�������");
		friend.setName(input.next());
		System.out.println("\t"+"��������Ҫ�����ϵ�˵����䣺");
		friend.setAge(input.nextInt());
		System.out.println("\t"+"��������Ҫ�����ϵ�˵��Ա�");
		friend.setSex(input.next().charAt(0));
		System.out.println("\t"+"��������Ҫ�����ϵ�˵ĺ��룺");
		friend.setNumber(input.next());
		return friend;
	}
	/**
	 * ��ѯ������ϵ��
	 * 
	 * @param f
	 * @param friends
	 */
	public static void searchAll(Function f, Friend[] friends) {
		f.searchAll(friends);
	}

	/**
	 * 
	 * �����ֲ�����ϵ��
	 * 
	 * @param f
	 * @param name
	 * @param friends
	 */
	public static void searchFriend(Function f, String name, Friend[] friends) {
		f.searchFriend(name, friends);
	}

	/**
	 * �������޸���ϵ�˺���
	 * 
	 * @param f
	 * @param name
	 * @param friends
	 * @param number
	 */
	public static void setFriendByName(Function f, String name, Friend[] friends, String number) {
		f.setFriendByName(name, number, friends);
	}

	/**
	 * ������ɾ��ϵ��
	 * 
	 * @param f
	 * @param number
	 * @param friends
	 */
	public static void deleteFriendByNumber(Function f, String number, Friend[] friends) {
		f.deleteFriendByNumber(number, friends);
	}

	/**
	 * ������ɾ��ϵ��
	 * 
	 * @param f
	 * @param name
	 * @param friends
	 */
	public static void deleteFriendByName(Function f, String name, Friend[] friends) {
		f.deleteFriendByName(name, friends);
	}

	/**
	 * 
	 * �����ϵ��
	 * 
	 * @param f
	 * @param friend
	 * @param friends
	 */
	public static void addFriend(Function f, Friend friend, Friend[] friends) {
		f.addFriend(friend, friends);
	}
}
