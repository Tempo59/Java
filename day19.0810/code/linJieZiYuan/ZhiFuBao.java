package linJieZiYuan;

import java.util.concurrent.locks.ReentrantLock;

public class ZhiFuBao {
	
	//����һ��ͬ��������
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
	
	//��Ǯ
	public int hua(int money) {
		l.lock();
		if(ye>=money) {
			ye = ye - money;
		}else {
			System.out.println("���㣬֧��ʧ��");
		}
		System.out.println(ye);
//		l.unlock();
		return ye;
	}
	
	//��Ǯ
	public int cun(int money) {
		l.lock();
		ye = ye + money;
		System.out.println(ye);
		l.unlock();
		return ye;
	}

}



