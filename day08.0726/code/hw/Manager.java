package hw;

public class Manager {
	
	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.fun1(Albb.getBoss());
		Manager m1 = new Manager();
//		m1.fun();
		m1.fun1(Albb.getBoss());
		
	}
	
//	private Albb boss;
	
//	public Manager() {
//		boss = Albb.getBoss();
//	}
	
	public void fun1(Albb boss) {
		System.out.println(boss);
	}
	
//	public void fun() {
//		System.out.println(boss);
////		System.out.println("姓名是"+boss.getName()+
////				"性别是"+boss.getSex()+"身高是"
////				+boss.getHeight()+"薪水是"+boss.getSal());
//	}

}
