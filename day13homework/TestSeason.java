package day13homework;

public class TestSeason {

	public static void main(String[] args) {
		Season s=Season.WINTER;
		switch(s) {
		case SPRING:System.out.println("�ڴ����Ͽ���ˬ");
	    break;
		case SUMMER:System.out.println("�������Ͽ���ˬ");
        break;
		case AUTUMN:System.out.println("�������Ͽ���ˬ");
        break;
		case WINTER:System.out.println("�ڶ����Ͽ���ˬ");
        break;
        default:System.out.println("���Ͽ���ˬ��");
	}
}
}
