import java.util.*;
class Demo6 
{
	public static void main(String[] args) 
	{
		int a = (int)(Math.random()*11);
		int b = (int)(Math.random()*11);
		System.out.println(a+" "+b);
		System.out.println("�밴˳���������������ĺͣ��������");
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int c = input.nextInt();
		int j = input.nextInt();
		int s = input.nextInt();
		int score = 0;
		if (h==(a+b))
		{
			score++;
		}
		if (c==(a-b))
		{
			score++;
		}
		if (j==(a*b))
		{
			score++;
		}
		if (s==(a/b))
		{
			score++;
		}
		System.out.println(score);
	}
}
