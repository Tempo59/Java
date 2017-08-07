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
					+ "\n6.���Ҵ��ڵ���ָ�����ۼ۵�������Ʒ\n7.����С��ָ�������۵�������Ʒ"
					+ "\n8.��ѯ������Ʒ/���������������۽������ۼ۽��򡢽��۽����������򡢱������"
					+ "\n9.������һ��");
			int choose = input.nextInt();
			switch(choose) {
			case 1:
				Good good = makeGood();
				m.addGood(set, good);
				break;
			case 2:
				if(set.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫɾ����Ʒ�ı��");
				int id = input.nextInt();
				m.deleteById(set, id);
				break;
			case 3:
				if(set.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫɾ����Ʒ������");
				String name = input.next();
				m.deleteByName(set, name);
				break;
			case 4:
				if(set.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫ�޸���Ʒ������");
				int sales = input.nextInt();
				System.out.println("���ۼ��޸�Ϊ����");
				double newPrice = input.nextDouble();
				m.setPriceBySales(set, sales, newPrice);
				break;
			case 5://5.����Ʒ�����޸���Ʒ��������
				if(set.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫ�޸���Ʒ�Ľ���");
				double cost = input.nextDouble();
				System.out.println("�������޸�Ϊ");
				double newPriceAll = input.nextDouble();
				m.setPriceByCost(set, cost, newPriceAll);
				break;
			case 6://6.�����ۼ۲�ѯ��Ʒ
				if(set.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫ��ѯ��Ʒ�����ۼ�");
				double priceOne = input.nextDouble();
				TreeSet<Good> l = (TreeSet<Good>) m.queryByPriceOne(set, priceOne);
				query(l);
				break;
			case 7://7.�������۲�ѯ��Ʒ
				if(set.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				System.out.println("����Ҫ��ѯ��Ʒ��������");
				double priceAll = input.nextDouble();
				TreeSet<Good> l1 = (TreeSet<Good>) m.queryByPriceAll(set, priceAll);
				query(l1);
				break;
			case 8://8.��ѯ������Ʒ
				if(set.size()==0) {
					System.out.println("û����Ʒ���������");
					break;
				}
				m.allQuery(set);
				break;
			case 9:
				return;
			default :
				System.out.println("������������������");
			}
		}
	}
	//��������
	private static void query(Set<Good> l) {
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
