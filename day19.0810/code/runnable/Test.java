package runnable;

public class Test {
	
	public static void main(String[] args) {
		
		RunnableInpl r1 = new RunnableInpl();
		RunnableInpl r2 = new RunnableInpl();
//		r.run();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
	}

}
