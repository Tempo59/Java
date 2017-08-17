public class ArraysTools {
	// 倒序输出一个数组
	public static void fun(int a[] ) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int c = a.length;
			b[c] = a[i];
			c = c - 1;
			if (c < 0) {
				break;
			}

		}
		for (int i : b) {
			System.out.println(i);
		}

	}
public static void main(String[] args) {
	int b[]= {1,2,3,4,5,6,7,8,9};
	ArraysTools.fun( b);
}
}
