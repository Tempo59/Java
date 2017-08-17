import java.util.*;
class Demo5 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		fun(a);
	}

	public static void fun(int a){
		while (a>0)
		{
			System.out.print(a%10);
			a = a / 10;
		}
		System.out.println();
	}
}
