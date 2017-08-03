package day13homework;

public class TestSeason {

	public static void main(String[] args) {
		Season s=Season.WINTER;
		switch(s) {
		case SPRING:System.out.println("在春天上课最爽");
	    break;
		case SUMMER:System.out.println("在夏天上课最爽");
        break;
		case AUTUMN:System.out.println("在秋天上课最爽");
        break;
		case WINTER:System.out.println("在冬天上课最爽");
        break;
        default:System.out.println("不上课最爽了");
	}
}
}
