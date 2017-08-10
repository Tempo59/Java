package thread;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TestMyTHread1 {
	
	public static void main(String[] args) {
		
		MyThread mt1 = new MyThread();
		MyThread1 mt2 = new MyThread1();
		mt2.setPriority(Thread.MAX_PRIORITY);
		mt1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		mt1.setName("线程1");
		mt2.setName("线程2");
		//启动线程
		mt1.start();
		mt2.start();
		
//		mt.run();
		
//		Thread t = Thread.currentThread();
//		System.out.println(t.getName());
		
	}

}
