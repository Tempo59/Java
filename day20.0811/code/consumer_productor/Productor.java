package consumer_productor;

public class Productor implements Runnable {
	//产品
	private Product p;
	public Productor(Product p) {
		this.p = p;
	}

	//判断条件
	Check c = Check.getCheck();
	
	@Override
	public void run() {
		while(true) {
			synchronized(c) {
				//非boo说明需要消费
				while(!c.isBoo()) {
					try {
						c.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				p.setName("火锅");
				System.out.println(Thread.currentThread().getName()
						+"生产者生产了一个产品"+this.p);
				c.setBoo(!c.isBoo());
				c.notifyAll();
//				synchronized(c) {
//					c.notify();
//				}
			}
		}
	}

}





