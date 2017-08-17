package exception_;

public class Boss {
	
	private String name;
	private Boss(String name) {
		this.name = name;
	}
	private static Boss boss;
	public static Boss getBoss() {
		if(boss==null) {
			boss = /*"zhangsan*/new Boss("уехЩ");
		}
		return boss;
	}

}
