package enum_;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		//声明枚举变量
		Scanner input = new Scanner(System.in);
		String s = input.next();
		Week w = Week.MONDAY;
		switch(w) {
		case MONDAY:
			System.out.println("一周的第一天，雄起");
			break;
		case TUESDAY:
			System.out.println("第二天");
			break;
		case WEDNESDAY:
			System.out.println("过了星期三，不愁星期天");
			break;
		case THURSDAY:
			System.out.println("第四天");
			break;
		case FRIDAY:
			System.out.println("最后一天工作日，奋斗");
			break;
		case SATURDAY:
			System.out.println("睡个懒觉");
			break;
		default:
			System.out.println("嗨一天");
			break;
		}
		
	}

}
