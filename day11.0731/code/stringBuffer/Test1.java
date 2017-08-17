package stringBuffer;

public class Test1 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		String s = ""+true;
		//append×·¼Ó
		sb.append(true);
		System.out.println(sb.length());
		System.out.println(sb);
		sb.append(false);
		System.out.println(sb);
		
		sb.delete(0, 4);
		System.out.println(sb);
		
	}

}
