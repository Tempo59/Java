package testFruit;

public class Tools {
	
	//�ж�һ��˵����ƻ��������
	public static void check(Fruit f) {
		if(f instanceof Apple) {
			Apple a = (Apple) f;
			a.zha();
		}else if(f instanceof Pair) {
			Pair p = (Pair) f;
			p.zhi();
		}
	}
	
	public static void main(String[] args) {
		
		Fruit f = new Pair("Ѽ��","�ɶ�");
		Tools.check(f);
		
	}

}




