import java.util.*;
class Demo16 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1},{2,3,4,5}};
		//System.out.println(arr[1][2]);

		int[] a = {12,2,34,14,5,64,72,18,49};
		Arrays.fill(a,1);
		//Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for (int i:a)
		{
			//System.out.print(i+" ");
		}
		System.out.println();
		//int index = Arrays.binarySearch(a,18);
		//System.out.println(index);
	}
}
