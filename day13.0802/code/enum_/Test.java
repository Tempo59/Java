package enum_;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		//����ö�ٱ���
		Scanner input = new Scanner(System.in);
		String s = input.next();
		Week w = Week.MONDAY;
		switch(w) {
		case MONDAY:
			System.out.println("һ�ܵĵ�һ�죬����");
			break;
		case TUESDAY:
			System.out.println("�ڶ���");
			break;
		case WEDNESDAY:
			System.out.println("����������������������");
			break;
		case THURSDAY:
			System.out.println("������");
			break;
		case FRIDAY:
			System.out.println("���һ�칤���գ��ܶ�");
			break;
		case SATURDAY:
			System.out.println("˯������");
			break;
		default:
			System.out.println("��һ��");
			break;
		}
		
	}

}
