package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		/*
		 * ������
		 * 	��Ҫ��������Ҫ��ѯ������
		 * 	��ȡһ��Calendar����
		 * 	��������
		 * 	��Calendar�����������Ϊ1
		 * 	ȷ�����µ�һ�����������λ��
		 */
		
		//��������Ҫ��ѯ������
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ�����");
		int year = input.nextInt();
		System.out.println("������Ҫ��ѯ���·�");
		int month = input.nextInt();
		//��ȡһ��Calendar����
		Calendar c = Calendar.getInstance();
		//��������
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);
		//��������Ϊ���µ�һ��
		c.set(Calendar.DATE, 1);
		//��ȡ���µ���С���ں��������
		int day = c.getMinimum(Calendar.DATE);
		int days = c.getActualMaximum(Calendar.DATE);
		//�жϵ��µ�һ�����ڼ�
		int week = c.get(Calendar.DAY_OF_WEEK);
		//��������ͷ������
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		//ȷ����һ������λ��
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
//		System.out.println();
		//ѭ���������
		while(day<=days) {
			c.set(Calendar.DATE, day);
			int weeks = c.get(Calendar.DAY_OF_WEEK);
			switch(weeks) {
			case 7:
				System.out.println(day);
				break;
			default:
				System.out.print(day+"\t");
				break;
			}
			day++;
		}
//		for(int i=1; i<=days; i++) {
//			//ÿ��ѭ������ǰ�����趨Ϊ��ǰi��ֵ
//			c.set(Calendar.DATE, i);
//			int weeks = c.get(Calendar.DAY_OF_WEEK);
////			System.out.println(weeks);
//			switch(weeks) {
//			case 7:
//				System.out.println(i);
//				break;
//			default:
//				System.out.print(i+"\t");
//				break;
//			}
//		}
		
	}

}






