package linJieZiYuan;

public class Test2 {
	//��Ǯ�߳�
	static Runnable r1 = new Runnable() {
		
		@Override
		public void run() {
			//��ȡ֧����
			ZhiFuBao zfb = ZhiFuBao.getzfb();
			zfb.hua(1500);
		}
	};
	//��Ǯ�߳�
	static Runnable r2 = new Runnable() {
		
		@Override
		public void run() {
			ZhiFuBao zfb = ZhiFuBao.getzfb();
			zfb.cun(500);
		}
	};
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
	}

}
