package test6;

public class King {
	
	private String name;

	//私有构造方法
	private King (String name){
		this.name = name;
	}
	//静态本类私有对象作为属性
	private static King king;
	//共有静态方法获取本类对象
	public static King getKing(){
		if(king==null) {
			king = new King("秦始皇");
		}
		return king;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
