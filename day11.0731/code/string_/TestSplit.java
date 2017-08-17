package string_;

public class TestSplit {
	
	public static void main(String[] args) {
		
		String str = "hello,my name is hmm";
		
		String regex = "[m]";
		
		String[] strs = str.split(regex);
		System.out.println(strs.length);
		for(String s:strs) {
			System.out.println(s);
		}
		
	}

}
