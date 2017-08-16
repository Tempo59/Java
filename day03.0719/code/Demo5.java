import java.util.*;
class Demo5 
{
	public static void main(String[] args) 
	{
		/*
		成绩级别由键盘输入
		例：根据成绩级别，判断分数的范围
		90-100		A
		80-90		B
		70-80		C
		60-70		D
		0-60		E
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩级别");
		String grade = input.next();
		switch (grade)
		{
		case "b":
		case "B":
			System.out.println("80~90");
			break;
		case "c":
		case "C":
			System.out.println("70~80");
			break;
		default :
			System.out.println("输入无效");
			break;
		case "d":
		case "D":
			System.out.println("60~70");
			break;
		case "e":
		case "E":
			System.out.println("0~60");
			break;
		case "A":
		case "a":
			System.out.println("90~100");
			break;
		}
	}
}
