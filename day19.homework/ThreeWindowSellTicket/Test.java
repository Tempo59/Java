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
						System.out.println(Thread.currentThread().getName()+"����һ��Ʊ,��ʣ"+ticket+"��");
					}
					
				}
			}
			}
		};
		
		Thread t1=new Thread(r,"����һ");
		Thread t2=new Thread(r,"���ڶ�");
		Thread t3=new Thread(r,"������");
		t1.start();
		t2.start();
		t3.start();
	}
}
