package friendTest;

import java.util.Scanner;

public class Tools {
	static final Scanner input = new Scanner(System.in);

	static final Friends f = new Friends();
	
	static final Operate o = new Operate();
	
	public static void start() {
		System.out.println("欢迎使用xxx电话本");
		while(true) {
			System.out.println("1、添加联系人\n"
					+ "2、按姓名删除联系人\n"
					+ "3、按号码删除联系人\n"
					+ "4、按姓名修改联系人\n"
					+ "5、按姓名查询联系人\n"
					+ "6、查询所有联系人"
					+ "\n7、退出");
			System.out.println("请选择");
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
					System.out.println("没有联系人，请先添加");
					break;
				}
				System.out.println("请输入要删除的联系人姓名");
				String name1 = input.next();
				f.setFriends(o.deleteFriendByName(name1, f.getFriends()));
				break;
			case 3:
				System.out.println("请输入要删除的联系人的号码");
				String id1 = input.next();
//				o.deleteFriendByNumber(id1, friends);
				break;
			case 4:
				if(f.getFriends().length==0) {
					System.out.println("没有联系人，请先添加");
					break;
				}
				System.out.println("请输入要修改的联系人姓名");
				String name2 = input.next();
				System.out.println("请输入修改的号码");
				String id2 = input.next();
				f.setFriends(o.setFriend(name2, id2, f.getFriends()));
				break;
			case 5:
				System.out.println("请输入要查询的联系人姓名");
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
				System.out.println("输入有误，请重新输入");
			}
		}
	}

	private static Friend getFriend() {
		System.out.println("按要求输入新联系人信息");
		System.out.println("姓名");
		String name = input.next();
		System.out.println("年龄");
		int age = input.nextInt();
		System.out.println("性别");
		char sex = input.next().charAt(0);
		System.out.println("号码");
		String id = input.next();
		Friend friend = new Friend(name, age, sex, id);
		return friend;
	}

}
