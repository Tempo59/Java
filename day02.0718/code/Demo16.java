import java.util.Scanner;
class Demo16 
{
	public static void main(String[] args) 
	{
		/*
	����������������������������ϴ����
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();//�����Է���		
		*/
		//��׼������
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		//ʹ����Ŀ������ҳ�a��b�нϴ����
		int c = a>b?a:b;
		System.out.println(c);
	}
}
