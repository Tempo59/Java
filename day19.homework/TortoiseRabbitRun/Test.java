package TortoiseRabbitRun;

public class Test {
	static int i=0;
	static int j=0;

	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				for(i=1;i<=100;i++) {
						try {
							Thread.sleep(500);
                            if(i==81) {
							Thread.sleep(60000);
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					System.out.println(Thread.currentThread().getName()+"跑到"+i+"米处");
				}
				
			}
		};
         Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				for(j=1;j<=100;j++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"跑到"+j+"米处");
				}
				
			}
		};
		Thread t1=new Thread(r1,"兔子");
		Thread t2=new Thread(r2,"乌龟");
		
		t1.start();
		t2.start();
		
		
	}
}
