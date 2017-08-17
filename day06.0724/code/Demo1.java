import java.util.*;
class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//int a = input.nextInt();
		for (int j=100; j<=1000; j++)
		{
			for (int i=2; i<=j/2; i++)
			{
				if(i==j/2){
					System.out.println(j+"yes");
					break;
				}
				if(j%i==0){
					System.out.println(j+"no");
					break;
				}
			}
		}
		
		System.out.println();
	}
}
