package testSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tools {
	
	private static final Scanner input = new Scanner(System.in);
	private static final ArrayList<Manager> managers = new ArrayList<>();
	private static final TreeSet<Good> set = new TreeSet<>();
	//开始
	public static void start() {
		while(true) {
			System.out.println("请选择操作\n1.注册新用户\n2.登陆已有用户\n3.退出");
			int choose = input.nextInt();
			switch(choose) {
			case 1:
				register();
				break;
			case 2:
				login();
				break;
			case 3:
				return;
			default:
				System.out.println("输入有误，请重新输入");
				break;
			}
		}
	}
	//登陆
	private static void login() {
		System.out.println("请输入用户名");
		String name = input.next();
		boolean b = check(name);
		if(b) {
			while(true) {
				System.out.println("请输入密码");
				String password = input.next();
				Manager m = checkLogin(name,password);
				if(m!=null) {
					System.out.println("登陆成功，请选择操作");
					//调用商品操作的方法，将管理员对象传入（使用m对象的成员方法对商品进行增删改查操作）
					operate(m);
				}else {
					System.out.println("密码错误请重新输入密码");
				}
			}
		}else {
			System.out.println("用户名不存在");
			return;
		}
	}
	//选择对商品的操作
	private static void operate(Manager m) {
		while(true) {
			System.out.println("\n1.添加商品\n2.按编号删除商品\n3.按名称删除商品"
					+ "\n4.按商品销量修改商品的零售价\n5.按商品进价修改商品的批发价"
					+ "\n6.查找大于等于指定零售价的所有商品\n7.查找小于指定批发价的所有商品"
					+ "\n8.查询所有商品/按销量降序、批发价降序、零售价降序、进价降序、名称升序、编号升序"
					+ "\n9.返回上一级");
			int choose = input.nextInt();
			switch(choose) {
			case 1:
				Good good = makeGood();
				m.addGood(set, good);
				break;
			case 2:
				if(set.size()==0) {
					System.out.println("没有商品，请先添加");
					break;
				}
				System.out.println("输入要删除商品的编号");
				int id = input.nextInt();
				m.deleteById(set, id);
				break;
			case 3:
				if(set.size()==0) {
					System.out.println("没有商品，请先添加");
					break;
				}
				System.out.println("输入要删除商品的名称");
				String name = input.next();
				m.deleteByName(set, name);
				break;
			case 4:
				if(set.size()==0) {
					System.out.println("没有商品，请先添加");
					break;
				}
				System.out.println("输入要修改商品的销量");
				int sales = input.nextInt();
				System.out.println("零售价修改为多少");
				double newPrice = input.nextDouble();
				m.setPriceBySales(set, sales, newPrice);
				break;
			case 5://5.按商品进价修改商品的批发价
				if(set.size()==0) {
					System.out.println("没有商品，请先添加");
					break;
				}
				System.out.println("输入要修改商品的进价");
				double cost = input.nextDouble();
				System.out.println("批发价修改为");
				double newPriceAll = input.nextDouble();
				m.setPriceByCost(set, cost, newPriceAll);
				break;
			case 6://6.按零售价查询商品
				if(set.size()==0) {
					System.out.println("没有商品，请先添加");
					break;
				}
				System.out.println("输入要查询商品的零售价");
				double priceOne = input.nextDouble();
				TreeSet<Good> l = (TreeSet<Good>) m.queryByPriceOne(set, priceOne);
				query(l);
				break;
			case 7://7.按批发价查询商品
				if(set.size()==0) {
					System.out.println("没有商品，请先添加");
					break;
				}
				System.out.println("输入要查询商品的批发价");
				double priceAll = input.nextDouble();
				TreeSet<Good> l1 = (TreeSet<Good>) m.queryByPriceAll(set, priceAll);
				query(l1);
				break;
			case 8://8.查询所有商品
				if(set.size()==0) {
					System.out.println("没有商品，请先添加");
					break;
				}
				m.allQuery(set);
				break;
			case 9:
				return;
			default :
				System.out.println("输入有误请重新输入");
			}
		}
	}
	//遍历集合
	private static void query(Set<Good> l) {
		Iterator<Good> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	//键盘输入新添加商品的信息
	private static Good makeGood() {
		//编号(id),名称(name),进价(cost),
		//零售价(priceOne),批发价(priceAll),销量(sales),产地(place)
		System.out.println("请输入商品的编号");
		int id = input.nextInt();
		System.out.println("请输入商品名称");
		String name = input.next();
		System.out.println("请输入商品进价");
		double cost = input.nextDouble();
		System.out.println("请输入商品的零售价");
		double priceOne = input.nextDouble();
		System.out.println("请输入商品批发价");
		double priceAll = input.nextDouble();
		System.out.println("请输入商品的销量");
		int sales = input.nextInt();
		System.out.println("请输入商品的产地");
		String place = input.next();
		return new Good(id, name, cost, priceOne, priceAll, sales, place);
	}
	//登陆检查密码和用户名是否正确
	private static Manager checkLogin(String name, String password) {
		Iterator<Manager> it = managers.iterator();
		while(it.hasNext()) {
			Manager m = it.next();
			if(m.getName().equals(name)) {
				if(m.getPassword().equals(password)) {
					return m;
				}
			}
		}
		return null;
	}
	//注册
	private static void register() {
		while(true) {
			System.out.println("请输入新用户名");
			String name = input.next();
			//判断输入的用户名是否存在
			boolean b = check(name);
			if(!b) {
				System.out.println("请设置密码");
				String password = input.next();
				Manager m = new Manager(name, password);
				managers.add(m);
				System.out.println("注册成功！");
				break;
			}else {
				System.out.println("此用户名已被占用，请重新输入");
			}
		}
	}
	//判断输入的用户名是否存在
	private static boolean check(String name) {
		Iterator<Manager> it = managers.iterator();
		while(it.hasNext()) {
			if(it.next().getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

}
