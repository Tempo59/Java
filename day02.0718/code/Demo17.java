import java.util.Scanner;
class Demo17 
{
	public static void main(String[] args) 
	{
		//���������������������������������
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		//int d = (a>b?a:b)>c?(a>b?a:b):c;
		int d = a>b?a:b;
		int e = d>c?d:c;
		System.out.println(e);
	}
}
