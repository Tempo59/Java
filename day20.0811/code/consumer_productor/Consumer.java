package consumer_productor;

public class Consumer implements Runnable {
	//��Ʒ
	private Product p;
	public Consumer(Product p) {
		this.p = p;
	}

	//�ж�����
	Check c = Check.getCheck();
	
	@Override
	public void run() {
		while(true) {//ѭ������
			synchronized(c) {
				while(c.isBoo()) {
					try {
						c.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()
						+"������������һ����Ʒ"+this.p);
				c.setBoo(!c.isBoo());
				c.notifyAll();
//				synchronized("") {
//					"".notify();
//				}
			}
		}
	}

}
