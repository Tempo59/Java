package friendTest;

import java.util.Scanner;

public class Tools {
	static final Scanner input = new Scanner(System.in);

	static final Friends f = new Friends();
	
	static final Operate o = new Operate();
	
	public static void start() {
		System.out.println("��ӭʹ��xxx�绰��");
		while(true) {
			System.out.println("1�������ϵ��\n"
					+ "2��������ɾ����ϵ��\n"
					+ "3��������ɾ����ϵ��\n"
					+ "4���������޸���ϵ��\n"
					+ "5����������ѯ��ϵ��\n"
					+ "6����ѯ������ϵ��"
					+ "\n7���˳�");
			System.out.println("��ѡ��");
			int choose = input.nextInt();
			switch(choose) {
			case 1:
				Friend friend = getFriend();
				Friend[] fs = o.addFriend(friend, f.getFriends());
				f.setFriends(fs);
//				System.out.println(f.getFriends().length);
				break;
			case 2:
				if(f.getFriends().length==0) {
					System.out.println("û����ϵ�ˣ��������");
					break;
				}
				System.out.println("������Ҫɾ������ϵ������");
				String name1 = input.next();
				f.setFriends(o.deleteFriendByName(name1, f.getFriends()));
				break;
			case 3:
				System.out.println("������Ҫɾ������ϵ�˵ĺ���");
				String id1 = input.next();
//				o.deleteFriendByNumber(id1, friends);
				break;
			case 4:
				if(f.getFriends().length==0) {
					System.out.println("û����ϵ�ˣ��������");
					break;
				}
				System.out.println("������Ҫ�޸ĵ���ϵ������");
				String name2 = input.next();
				System.out.println("�������޸ĵĺ���");
				String id2 = input.next();
				f.setFriends(o.setFriend(name2, id2, f.getFriends()));
				break;
			case 5:
				System.out.println("������Ҫ��ѯ����ϵ������");
				String name3 = input.next();
				Friend fri = o.searchFriend(name3, f.getFriends());
				System.out.println(fri);
				break;
			case 6:
				o.searchAll(f.getFriends());
				break;
			case 7:
				return;
			default:
				System.out.println("������������������");
			}
		}
	}

	private static Friend getFriend() {
		System.out.println("��Ҫ����������ϵ����Ϣ");
		System.out.println("����");
		String name = input.next();
		System.out.println("����");
		int age = input.nextInt();
		System.out.println("�Ա�");
		char sex = input.next().charAt(0);
		System.out.println("����");
		String id = input.next();
		Friend friend = new Friend(name, age, sex, id);
		return friend;
	}

}
