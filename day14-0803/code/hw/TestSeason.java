package hw;

import java.util.Scanner;

public class TestSeason {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		Season s;
		if(i==1) {
			s = Season.SPRINT;
		}else if(i==2) {
			s = Season.SUMMER;
		}else if(i==3) {
			s = Season.AUTUMN;
		}else {
			s = Season.WINTER;
		}
		switch(s) {
		case SPRINT:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		default:
			System.out.println("冬天");
			break;
		}
		
	}
	
}
