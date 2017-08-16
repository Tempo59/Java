import java.util.*;
class Demo7 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//动态初始化数组
		int[] arr = new int[5];
		//System.out.println(arr.length);
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = input.nextInt();
		}

		for (int i:arr)
		{
			System.out.println(i);
		}
	}
}
