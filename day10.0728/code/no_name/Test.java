package no_name;

public class Test {
	
	public static void main(String[] args) {
		
		I i1 = new I() {
			
			@Override
			public void fun() {
				System.out.println("i1�����fun����");
			}
		};
		I i2 = new I() {
			
			@Override
			public void fun() {
				System.out.println("i1�����fun����");
			}
		};
		
	}

}
