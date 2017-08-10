package ThreeWindowSellTicket;

public class Test {
    static int ticket=50;
	public static void main(String[] args) {
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				while(ticket>0) {
				synchronized ("") {
					if(ticket>0) {
						--ticket;
						System.out.println(Thread.currentThread().getName()+"卖了一张票,还剩"+ticket+"张");
					}
					
				}
			}
			}
		};
		
		Thread t1=new Thread(r,"窗口一");
		Thread t2=new Thread(r,"窗口二");
		Thread t3=new Thread(r,"窗口三");
		t1.start();
		t2.start();
		t3.start();
	}
}
