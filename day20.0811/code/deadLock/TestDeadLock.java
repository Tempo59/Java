package deadLock;

public class TestDeadLock {
	
	public static void main(String[] args) {
		
		new Thread(r, "��ɽ��").start();;
		new Thread(r, "��ɽ��").start();;
		
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
								+"��ȡ�˵�һ����o1���ȴ��ڶ�����o2");
						synchronized(o2) {
							System.out.println(Thread.currentThread().getName()
									+"��ȡ��������o1��o2���߳�ִ�н���");
						}
					}
				}else {
					synchronized(o2) {
						i++;
						System.out.println(Thread.currentThread().getName()
								+"��ȡ�˵�һ����o2���ȴ��ڶ�����o1");
						synchronized(o1) {
							System.out.println(Thread.currentThread().getName()
									+"��ȡ��������o2��o1���߳�ִ�н���");
						}
					}
				}
			}
		}
	};

}





