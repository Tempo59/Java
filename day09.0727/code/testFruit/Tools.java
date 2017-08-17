package testFruit;

public class Tools {
	
	//判断一个说过是苹果还是梨
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
		
		Fruit f = new Pair("鸭梨","成都");
		Tools.check(f);
		
	}

}




