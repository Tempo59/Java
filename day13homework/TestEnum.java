package day13homework;

public class TestEnum {

	public static void main(String[] args) {
		Month m=Month.APRIL;
		switch(m) {
		case JANUARY:System.out.println("这个月有31天");
			         break;
		case FEBRUARY:System.out.println("这个月有28天,闰年的话29天");
			         break;
		case MARCH:System.out.println("这个月有31天");
			         break;
		case APRIL:System.out.println("这个月有30天");
			         break;
		case MAY:System.out.println("这个月有31天");
			         break;
		case JUNE:System.out.println("这个月有30天");
			         break;
		case JULY:System.out.println("这个月有31天");
			         break;
		case AUGUST:System.out.println("这个月有31天");
			         break;
		case SEPTEMBER:System.out.println("这个月有30天");
			         break;
		case OCTOBER:System.out.println("这个月有31天");
			         break;
		case NOVEMBER:System.out.println("这个月有30天");
			         break;
		case DECEMBER:System.out.println("这个月有31天");
			         break;
		default:System.out.println("月份有误");
		}
	}
}
