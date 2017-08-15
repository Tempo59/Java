package consumer_productor;

//测试是否需要生产的类
public class Check {
	
	private boolean boo = true;
	
	private Check() {}
	
	private static Check check = new Check();
	
	public static Check getCheck() {
		return check;
	}

	public boolean isBoo() {
		return boo;
	}

	public void setBoo(boolean boo) {
		this.boo = boo;
	}

}
