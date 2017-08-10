package OnetoTen;

public class Test {
	
	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<10;i+=2) {
					System.out.println(Thread.currentThread().getName()+"输出"+i);
				}
			}
		};
		
        Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				for(int i=2;i<=10;i+=2) {
					System.out.println(Thread.currentThread().getName()+"输出"+i);
				}
			}
		};
		
		Thread t1=new Thread(r1,"输奇线程");
		Thread t2=new Thread(r2,"输偶线程");
		t1.start();
		t2.start();
		
	}

}
