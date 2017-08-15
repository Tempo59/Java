package singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Boss {
	
	private static ReentrantLock l = new ReentrantLock();
	
	private static Boss b;
	
	private Boss() {}
	
	public static Boss getB() {
//		l.lock();
		synchronized("") {
			if(b==null) {
				b = new Boss();
			}
		}
//		l.unlock();
		return b;
	}

}
