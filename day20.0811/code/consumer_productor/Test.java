package consumer_productor;

public class Test {
	
	public static void main(String[] args) {
		Product p = new Product();
		//������
		Productor pro = new Productor(p);
		//������
		Consumer con = new Consumer(p);
		//�����̲߳�����
		new Thread(pro, "ϲ����").start();
		new Thread(pro, "mei����").start();
		new Thread(pro, "lan����").start();
		new Thread(con, "hong̫��").start();
		new Thread(con, "huang̫��").start();
		new Thread(con, "��̫��").start();
	}

}
