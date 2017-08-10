package linJieZiYuan;

import java.util.concurrent.locks.ReentrantLock;

public class ZhiFuBao {
	
	//设置一个同步锁对象
	ReentrantLock l = new ReentrantLock();
	
	private int ye = 2000;
	
	public int getYe() {
		return ye;
	}
	
	private ZhiFuBao() {}
	
	private static ZhiFuBao zfb = new ZhiFuBao();
	
	public static ZhiFuBao getzfb() {
		return zfb;
	}
	
	//花钱
	public int hua(int money) {
		l.lock();
		if(ye>=money) {
			ye = ye - money;
		}else {
			System.out.println("余额不足，支付失败");
		}
		System.out.println(ye);
//		l.unlock();
		return ye;
	}
	
	//存钱
	public int cun(int money) {
		l.lock();
		ye = ye + money;
		System.out.println(ye);
		l.unlock();
		return ye;
	}

}



