package productor_consumer;

public class TestProductorConsumer {
	
	public static void main(String[] args) {
		
		Product p = new Product();
		
		Productor pro = new Productor(p);
		Consumer con = new Consumer(p);
		
		new Thread(pro, "ϲ��").start();
		new Thread(pro, "����").start();
		new Thread(pro, "����").start();
		new Thread(con, "��̫��").start();
		new Thread(con, "��̫��").start();
		new Thread(con, "��̫��").start();
		
	}
	
	//�ж��Ƿ���Ҫ��������Ϊtrue�������ѣ�������Ҫ����
	static boolean boo = true;
	
	//������
	static class Consumer implements Runnable{
		private Product p;
		public Consumer (Product p) {
			this.p = p;
		}
		@Override
		public void run() {
			while(true) {
				synchronized("") {
					//����boo����Ҫ����
					if(!boo) {
						try {
							p.setName("���");
							"".wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						//������Ҫ����
						boo = !boo;
						"".notifyAll();
						System.out.println("������"
								+Thread.currentThread().getName()
								+"������һ����Ʒ"+this.p);
					}
				}
			}
		}
		
	}
	//������
	static class Productor implements Runnable{
		private Product p;
		public Productor(Product p) {
			this.p = p;
		}
		@Override
		public void run() {
			while(true) {
				synchronized("") {
					//���Ϊtrue����Ҫ����
					if(boo) {
						try {
							//���������̹߳���
							"".wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						//������Ҫ�������Ƚ��ж������޸�
						boo = !boo;
						"".notifyAll();
						System.out.println("������"
								+Thread.currentThread().getName()
								+"������һ����Ʒ"+this.p);
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
