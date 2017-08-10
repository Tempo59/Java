package thread;

public class MyThread1 extends Thread {
	
	@Override
	public void run() {
		Thread t = currentThread();
		System.out.println(t.getName());
		for(int i=0; i<10; i++) {
			System.out.println(t.getName()+"----"+i);
//			sleep(100);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
