import java.util.*;
class Demo6 
{
	public static void main(String[] args) 
	{
		/*
		分数由键盘输入
		例：根据学生分数，判断学生的成绩级别
		90-100		A
		80-90		B
		70-80		C
		60-70		D
		0-60		E
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("请输入分数");
		int score = input.nextInt();
		if (score>=0&&score<=100)
		{
			switch (score/10)
			{
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
			}
		}else{
			System.out.println("分数无效");
		}
		
	}
}
