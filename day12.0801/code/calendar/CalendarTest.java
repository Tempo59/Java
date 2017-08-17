package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		/*
		 * 分析：
		 * 	需要键盘输入要查询的年月
		 * 	获取一个Calendar对象
		 * 	设置年月
		 * 	将Calendar对象的日期设为1
		 * 	确定当月第一天日期输入的位置
		 */
		
		//键盘输入要查询的年月
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要查询的年份");
		int year = input.nextInt();
		System.out.println("请输入要查询的月份");
		int month = input.nextInt();
		//获取一个Calendar对象
		Calendar c = Calendar.getInstance();
		//设置年月
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);
		//将日期设为当月第一天
		c.set(Calendar.DATE, 1);
		//获取当月的最小日期和最大日期
		int day = c.getMinimum(Calendar.DATE);
		int days = c.getActualMaximum(Calendar.DATE);
		//判断当月第一天星期几
		int week = c.get(Calendar.DAY_OF_WEEK);
		//把日历的头输入来
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//确定第一天的输出位置
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
//		System.out.println();
		//循环输出日期
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
//			//每次循环将当前日期设定为当前i的值
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






