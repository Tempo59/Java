package linJieZiYuan;

public class Window extends Thread {
	
	static String s = new String();
	
	public Window() {}
	public Window(String name) {
		super(name);
	}
	
	static int ticket = 50;
	
	public synchronized void fun() {
		while(true) {
			synchronized(s) {
				if(ticket>0) {
					--ticket;
					System.out.println(currentThread().getName()
							+"������һ��Ʊ����ʣ"+ticket);
				}else {
					break;
				}
			}
		}
	}
	
	@Override
	public void run() {
		fun();
//		synchronized("") {
//			while(ticket>0) {
//				System.out.println(currentThread().getName()
//						+"������һ��Ʊ����ʣ"+--ticket);
//			}
//		}
//		while(true) {
//			fun();
//			synchronized(s) {
//				if(ticket>0) {
//					--ticket;
//					System.out.println(currentThread().getName()
//							+"������һ��Ʊ����ʣ"+ticket);
//				}else {
//					break;
//				}
//			}
//		}
	}

}
