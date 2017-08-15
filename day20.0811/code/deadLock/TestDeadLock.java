package deadLock;

public class TestDeadLock {
	
	public static void main(String[] args) {
		
		new Thread(r, "白山羊").start();;
		new Thread(r, "黑山羊").start();;
		
	}
	
	static int i = 1;
	static Object o1 = new Object();
	static Object o2 = new Object();
	
	static Runnable r = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				if(i%2==0) {
					synchronized(o1) {
						i++;
						System.out.println(Thread.currentThread().getName()
								+"获取了第一把锁o1，等待第二把锁o2");
						synchronized(o2) {
							System.out.println(Thread.currentThread().getName()
									+"获取了两把锁o1和o2，线程执行结束");
						}
					}
				}else {
					synchronized(o2) {
						i++;
						System.out.println(Thread.currentThread().getName()
								+"获取了第一把锁o2，等待第二把锁o1");
						synchronized(o1) {
							System.out.println(Thread.currentThread().getName()
									+"获取了两把锁o2和o1，线程执行结束");
						}
					}
				}
			}
		}
	};

}





