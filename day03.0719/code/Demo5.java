import java.util.*;
class Demo5 
{
	public static void main(String[] args) 
	{
		/*
		�ɼ������ɼ�������
		�������ݳɼ������жϷ����ķ�Χ
		90-100		A
		80-90		B
		70-80		C
		60-70		D
		0-60		E
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("������ɼ�����");
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
			System.out.println("������Ч");
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
