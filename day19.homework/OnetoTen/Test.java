package OnetoTen;

public class Test {
	
	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<10;i+=2) {
					System.out.println(Thread.currentThread().getName()+"���"+i);
				}
			}
		};
		
        Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				for(int i=2;i<=10;i+=2) {
					System.out.println(Thread.currentThread().getName()+"���"+i);
				}
			}
		};
		
		Thread t1=new Thread(r1,"�����߳�");
		Thread t2=new Thread(r2,"��ż�߳�");
		t1.start();
		t2.start();
		
	}

}
