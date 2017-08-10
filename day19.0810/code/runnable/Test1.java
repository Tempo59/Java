package runnable;

public class Test1 {
	
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"I am LiLei");
			}
		};
		Runnable r1 = new Runnable() {
			

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"hello");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"I am HMM");
			}
		};
		
		Thread t1 = new Thread(r,"ÀîÀ×1");
		Thread t2 = new Thread(r1,"HMM");
		Thread t3 = new Thread(r,"ÀîÀ×3");
		t1.setPriority(1);
		t2.setPriority(8);
		t3.setPriority(4);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
