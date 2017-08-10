package thread;

public class MyThread2 extends Thread {
	
	public static int num = 0;
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			num++;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread2 mt = new MyThread2();
		//Æô¶¯Ïß³Ì
		mt.start();
		
//		mt.join();
		
		System.out.println(num);
		
		sleep(1000);
		
		System.out.println(num);
		
	}

}
