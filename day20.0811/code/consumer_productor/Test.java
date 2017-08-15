package consumer_productor;

public class Test {
	
	public static void main(String[] args) {
		Product p = new Product();
		//生产者
		Productor pro = new Productor(p);
		//消费者
		Consumer con = new Consumer(p);
		//创建线程并启动
		new Thread(pro, "喜洋洋").start();
		new Thread(pro, "mei洋洋").start();
		new Thread(pro, "lan洋洋").start();
		new Thread(con, "hong太狼").start();
		new Thread(con, "huang太狼").start();
		new Thread(con, "灰太狼").start();
	}

}
