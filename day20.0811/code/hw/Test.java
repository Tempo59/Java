package hw;

public class Test {
	
	static Runnable r1 = new Runnable() {
		
		@Override
		public void run() {
			Thread t = new Thread(r2, "乌龟");
			t.start();
			for(int i=1; i<=100; i++) {
				if(i==80) {
					try {
						t.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("兔子跑了"+ (i)+"米");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};

	static Runnable r2 = new Runnable() {
		
		@Override
		public void run() {
			for(int i=1; i<=100; i++) {
				System.out.println("乌龟跑了"+(i)+"米");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	public static void main(String[] args) {
		
		new Thread(r1, "兔子").start();;
		
	}
	
}
