import java.util.Scanner;
class Demo16 
{
	public static void main(String[] args) 
	{
		/*
	案例：键盘输入两个整数，输出较大的数
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();//阻塞性方法		
		*/
		//标准输入流
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		//使用三目运算符找出a和b中较大的数
		int c = a>b?a:b;
		System.out.println(c);
	}
}
