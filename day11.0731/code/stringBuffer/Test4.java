package stringBuffer;

public class Test4 {
	
	public static void main(String[] args) {
		
		String str = "";
		String s = "1";
		long startTime = System.currentTimeMillis();
		for(int i=0; i<=1000; i++) {
			str += s;
		}
		System.out.println(str.length());
		long endTime = System.currentTimeMillis();
		System.out.println("����String��ʱ�䣺"+(endTime - startTime));
		
		StringBuffer sb = new StringBuffer();
		startTime = System.currentTimeMillis();
		for(int i=0; i<=1000; i++) {
			sb.append(s);
		}
		System.out.println(sb.length());
		endTime = System.currentTimeMillis();
		System.out.println("����StringBuffer��ʱ��:"+(endTime - startTime));
		
	}

}
