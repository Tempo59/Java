import java.util.*;
class Demo8 
{
	public static void main(String[] args) 
	{
		//例：计算1+2+3+...+99+100的值
		//定义一个变量用来存储和
		int sum = 0;
		for (int i=1; i<=4; i++)
		{
			sum += i;//sum = sum + i;
		}
		/*
			sum		i		sum			i
			0		1		1			2
			1		2		1+2=3		3
			3		3		1+2+3=6		4
		
		*/
	//	System.out.println(sum);

		/*
			键盘输入一个正整数，
			计算从1加到这个数的和
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int a = input.nextInt();
		int s = 0;
		for (int i=1; i<=a; i++)
		{
			s += i;
		}
		System.out.println(s);
	}
}
