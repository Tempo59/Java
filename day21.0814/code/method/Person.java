package method;

public class Person {
	
	public String name = "Tom";
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void fun(String str) {
		System.out.println(str);
	}
	
	public void fun(int i) {
		System.out.println(i);
	}
	
	private void fun(String str, int i) {
		System.out.println(str+i);
	}
	
	public int fun(int i1, int i2) {
		return i1+i2;
	}

}
