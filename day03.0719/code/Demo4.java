import java.util.*;
class Demo4 
{
	public static void main(String[] args) 
	{
		/*
		�����ɼ�������
		��������ѧ���������ж�ѧ���ĳɼ�����
		90-100		A
		80-90		B
		70-80		C
		60-70		D
		0-60		E
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("���������");
		int score = input.nextInt();
		if (score>=0 && score<=100)
		{
			if (score>=90 && score<=100)
			{
				System.out.println("A");
			}else if(score>=80){
				System.out.println("B");
			}else if (score>=70)
			{
				System.out.println("C");
			}else if (score>=60)
			{
				System.out.println("D");
			}else{
				System.out.println("E");
			}
		}else{
			System.out.println("����ķ�����Ч");
		}
		
	}
}
