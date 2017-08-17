package string;

public class Test5 {
	
	static String str = "";
	
	public static void main(String[] args) {
		
//		System.out.println(str.isEmpty());
		
		String s = "hello";
		//indexOf
		System.out.println(s.indexOf('l'));
		System.out.println(s.lastIndexOf('l'));
		
		System.out.println(fun(s, 'l'));
		
	}
	
	//设计一个方法 完成lastIndexOf的功能
	public static int fun(String str,int ch) {
		int index = -1;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==ch) {
				index = i;
				break;
			}
		}
		return index;
	}

}




