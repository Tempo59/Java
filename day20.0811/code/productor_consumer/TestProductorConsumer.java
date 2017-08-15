package productor_consumer;

public class TestProductorConsumer {
	
	public static void main(String[] args) {
		
		Product p = new Product();
		
		Productor pro = new Productor(p);
		Consumer con = new Consumer(p);
		
		new Thread(pro, "喜洋").start();
		new Thread(pro, "美羊").start();
		new Thread(pro, "懒洋").start();
		new Thread(con, "灰太狼").start();
		new Thread(con, "红太狼").start();
		new Thread(con, "武太郎").start();
		
	}
	
	//判断是否需要生产，当为true可以消费，否则需要生产
	static boolean boo = true;
	
	//消费者
	static class Consumer implements Runnable{
		private Product p;
		public Consumer (Product p) {
			this.p = p;
		}
		@Override
		public void run() {
			while(true) {
				synchronized("") {
					//若非boo，需要生产
					if(!boo) {
						try {
							p.setName("火锅");
							"".wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						//否则需要消费
						boo = !boo;
						"".notifyAll();
						System.out.println("消费者"
								+Thread.currentThread().getName()
								+"消费了一个产品"+this.p);
					}
				}
			}
		}
		
	}
	//生产者
	static class Productor implements Runnable{
		private Product p;
		public Productor(Product p) {
			this.p = p;
		}
		@Override
		public void run() {
			while(true) {
				synchronized("") {
					//如果为true，需要消费
					if(boo) {
						try {
							//将生产者线程挂起
							"".wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						//否则需要生产，先将判断条件修改
						boo = !boo;
						"".notifyAll();
						System.out.println("生产者"
								+Thread.currentThread().getName()
								+"生产了一个产品"+this.p);
					}
				}
			}
		}
		
	}

}

class Product {
	String name;
	int id;
	public void setName(String name) {
		this.name = name;
		this.id++;
	}
	public Product() {}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + "]";
	}
}
