package stringBuffer;

public class Test2 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
		
		System.out.println(sb.length());
		
		sb.insert(1, true);//hetruello		htrueello
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		
	}

}
