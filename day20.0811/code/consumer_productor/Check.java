package consumer_productor;

//�����Ƿ���Ҫ��������
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
