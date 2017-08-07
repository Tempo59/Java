package testList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Tools {
	
	private static final Scanner input = new Scanner(System.in);
	private static final ArrayList<Manager> managers = new ArrayList<>();
	private static final ArrayList<Good> list = new ArrayList<>();
	//��ʼ
	public static void start() {
		while(true) {
			System.out.println("��ѡ�����\n1.ע�����û�\n2.��½�����û�\n3.�˳�");
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
				System.out.println("������������������");
				break;
			}
		}
	}
	//��½
	private static void login() {
		System.out.println("�������û���");
		String name = input.next();
		boolean b = check(name);
		if(b) {
			while(true) {
				System.out.println("����������");
				String password = input.next();
				Manager m = checkLogin(name,password);
				if(m!=null) {
					System.out.println("��½�ɹ�����ѡ�����");
					//������Ʒ�����ķ�����������Ա�����루ʹ��m����ĳ�Ա��������Ʒ������ɾ�Ĳ������
					operate(m);
				}else {
					System.out.println("���������������������");
				}
			}
		}else {
			System.out.println("�û���������");
			return;
		}
	}
	//ѡ�����Ʒ�Ĳ���
	private static void operate(Manager m) {
		while(true) {
			System.out.println("\n1.�����Ʒ\n2.�����ɾ����Ʒ\n3.������ɾ����Ʒ"
					+ "\n4.����Ʒ�����޸���Ʒ�����ۼ�\n5.����Ʒ�����޸���Ʒ��������"
					+ "\n6.�����ۼ۲�ѯ��Ʒ\n7.�������۲�ѯ��Ʒ\n8.��ѯ������Ʒ\n9.������һ��");
			int choose = input.nextInt();
			switch(choose) {
			case 1:
				Good good = makeGood();
				m.addGood(list, good);
				break;
			case 2:
				if(list.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫɾ����Ʒ�ı��");
				int id = input.nextInt();
				m.deleteById(list, id);
				break;
			case 3:
				if(list.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫɾ����Ʒ������");
				String name = input.next();
				m.deleteByName(list, name);
				break;
			case 4:
				if(list.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫ�޸���Ʒ������");
				int sales = input.nextInt();
				System.out.println("���ۼ��޸�Ϊ����");
				double newPrice = input.nextDouble();
				m.setPriceBySales(list, sales, newPrice);
				break;
			case 5://5.����Ʒ�����޸���Ʒ��������
				if(list.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫ�޸���Ʒ�Ľ���");
				double cost = input.nextDouble();
				System.out.println("�������޸�Ϊ");
				double newPriceAll = input.nextDouble();
				m.setPriceByCost(list, cost, newPriceAll);
				break;
			case 6://6.�����ۼ۲�ѯ��Ʒ
				if(list.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫ��ѯ��Ʒ�����ۼ�");
				double priceOne = input.nextDouble();
				ArrayList<Good> l = (ArrayList<Good>) m.queryByPriceOne(list, priceOne);
				query(l);
				break;
			case 7://7.�������۲�ѯ��Ʒ
				if(list.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫ��ѯ��Ʒ��������");
				double priceAll = input.nextDouble();
				ArrayList<Good> l1 = (ArrayList<Good>) m.queryByPriceAll(list, priceAll);
				query(l1);
				break;
			case 8://8.��ѯ������Ʒ
				if(list.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				m.queryAll(list);
				break;
			case 9:
				return;
			default :
				System.out.println("������������������");
			}
		}
	}
	//��������
	private static void query(List<Good> l) {
		Iterator<Good> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	//���������������Ʒ����Ϣ
	private static Good makeGood() {
		//���(id),����(name),����(cost),
		//���ۼ�(priceOne),������(priceAll),����(sales),����(place)
		System.out.println("��������Ʒ�ı��");
		int id = input.nextInt();
		System.out.println("��������Ʒ����");
		String name = input.next();
		System.out.println("��������Ʒ����");
		double cost = input.nextDouble();
		System.out.println("��������Ʒ�����ۼ�");
		double priceOne = input.nextDouble();
		System.out.println("��������Ʒ������");
		double priceAll = input.nextDouble();
		System.out.println("��������Ʒ������");
		int sales = input.nextInt();
		System.out.println("��������Ʒ�Ĳ���");
		String place = input.next();
		return new Good(id, name, cost, priceOne, priceAll, sales, place);
	}
	//��½���������û����Ƿ���ȷ
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
	//ע��
	private static void register() {
		while(true) {
			System.out.println("���������û���");
			String name = input.next();
			//�ж�������û����Ƿ����
			boolean b = check(name);
			if(!b) {
				System.out.println("����������");
				String password = input.next();
				Manager m = new Manager(name, password);
				managers.add(m);
				System.out.println("ע��ɹ���");
				break;
			}else {
				System.out.println("���û����ѱ�ռ�ã�����������");
			}
		}
	}
	//�ж�������û����Ƿ����
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
