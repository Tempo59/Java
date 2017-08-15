package consumer_productor;

public class Consumer implements Runnable {
	//产品
	private Product p;
	public Consumer(Product p) {
		this.p = p;
	}

	//判断条件
	Check c = Check.getCheck();
	
	@Override
	public void run() {
		while(true) {//循环消费
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
						+"消费者消费了一个产品"+this.p);
				c.setBoo(!c.isBoo());
				c.notifyAll();
//				synchronized("") {
//					"".notify();
//				}
			}
		}
	}

}
