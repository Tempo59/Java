import java.util.*;
class Demo8 
{
	public static void main(String[] args) 
	{
		//��������1+2+3+...+99+100��ֵ
		//����һ�����������洢��
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
			��������һ����������
			�����1�ӵ�������ĺ�
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int a = input.nextInt();
		int s = 0;
		for (int i=1; i<=a; i++)
		{
			s += i;
		}
		System.out.println(s);
	}
}
