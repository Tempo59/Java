package day13homework;

public class Test {
	
	public static void main(String[] args) {
		Animal a=new Animal(3);
		ZooAnimalManageSystem zams=new ZooAnimalManageSystem();
		try {
			zams.fun(a);
		} catch (Exception e) {
			System.out.println("����������ʵ��");
			e.printStackTrace();
		}
	}

}
