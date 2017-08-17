package w02d10homework;

import java.util.Scanner;

/**
 * 工具类
 * @author Administrator
 *
 */
public class Tools {

	static String name;
	static String number;
	/**
	 * 开始电话本的操作
	 * 
	 * @param input
	 * @param Function
	 * @param friends
	 */
	public static void start(Scanner input,Function f,Friend[] friends) {
		
		 while(true) {
			 System.out.println("请输入你要进行的功能：");
				System.out.println("\t" + "1.新增联系人");
				System.out.println("\t" + "2.按姓名删除联系人");
				System.out.println("\t" + "3.按联系号码删除联系人");
				System.out.println("\t" + "4.按姓名修改联系人号码");
				System.out.println("\t" + "5.按姓名查询联系人");
				System.out.println("\t" + "6.查询所有联系人");
				System.out.println("\t" + "7.退出系统");
				char i = input.next().charAt(0);
				
				switch (i) {
				case '1':
					addFriend(f, initFriend(input), friends);
					break;
				case '2':
					System.out.println("请输入你要删除联系人的姓名：");
					name = input.next();
					deleteFriendByName(f, name, friends);
					break;
				case '3':
					System.out.println("请输入你要删除联系人的号码：");
					number = input.next();
					deleteFriendByNumber(f, number, friends);
					break;
				case '4':
					System.out.println("请输入你要修改联系的姓名：");
					name = input.next();
					Friend friend1 = f.searchFriend( name, friends);
					if (friend1 != null) {
						System.out.println("请输入新号码：");
						number = input.next();
						setFriendByName(f, name, friends, number);
					}
					break;
				case '5':
					System.out.println("请输入要查找联系人的姓名：");
					searchFriend(f, input.next(), friends);
					break;
				case '6':
					searchAll(f, friends);
					break;
				case '7':
					System.out.println("已成功退出系统!");
					System.exit(0);
					break;
				default:
					System.out.println("输入错误请重新输入！");
					break;
				}
		 }
		
	}

	/**
	 * 初始化一个联系人
	 * @param input
	 * @return
	 */
	public static Friend initFriend(Scanner input) {
		Friend friend = new Friend();
		System.out.println("\t"+"请输入你要添加联系人的姓名：");
		friend.setName(input.next());
		System.out.println("\t"+"请输入你要添加联系人的年龄：");
		friend.setAge(input.nextInt());
		System.out.println("\t"+"请输入你要添加联系人的性别：");
		friend.setSex(input.next().charAt(0));
		System.out.println("\t"+"请输入你要添加联系人的号码：");
		friend.setNumber(input.next());
		return friend;
	}
	/**
	 * 查询所有联系人
	 * 
	 * @param f
	 * @param friends
	 */
	public static void searchAll(Function f, Friend[] friends) {
		f.searchAll(friends);
	}

	/**
	 * 
	 * 按名字查找联系人
	 * 
	 * @param f
	 * @param name
	 * @param friends
	 */
	public static void searchFriend(Function f, String name, Friend[] friends) {
		f.searchFriend(name, friends);
	}

	/**
	 * 按名字修改联系人号码
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
	 * 按号码删联系人
	 * 
	 * @param f
	 * @param number
	 * @param friends
	 */
	public static void deleteFriendByNumber(Function f, String number, Friend[] friends) {
		f.deleteFriendByNumber(number, friends);
	}

	/**
	 * 按名字删联系人
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
	 * 添加联系人
	 * 
	 * @param f
	 * @param friend
	 * @param friends
	 */
	public static void addFriend(Function f, Friend friend, Friend[] friends) {
		f.addFriend(friend, friends);
	}
}
