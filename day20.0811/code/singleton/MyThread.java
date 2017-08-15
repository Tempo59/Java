package singleton;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		Boss b = Boss.getB();
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt1.start();
		mt2.start();
		
	}

}
