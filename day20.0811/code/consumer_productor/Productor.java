package consumer_productor;

public class Productor implements Runnable {
	//��Ʒ
	private Product p;
	public Productor(Product p) {
		this.p = p;
	}

	//�ж�����
	Check c = Check.getCheck();
	
	@Override
	public void run() {
		while(true) {
			synchronized(c) {
				//��boo˵����Ҫ����
				while(!c.isBoo()) {
					try {
						c.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				p.setName("���");
				System.out.println(Thread.currentThread().getName()
						+"������������һ����Ʒ"+this.p);
				c.setBoo(!c.isBoo());
				c.notifyAll();
//				synchronized(c) {
//					c.notify();
//				}
			}
		}
	}

}





