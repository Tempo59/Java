package string;

public class Test2 {
	
	public static void main(String[] args) {
		
		String s1 = "asD";
		String s2 = "asd";
		
		System.out.println(s1.equals(s2));
		
		//�Ƚ������ַ���
		int a = s1.compareToIgnoreCase(s2);
		System.out.println(a);
		
	}

}
