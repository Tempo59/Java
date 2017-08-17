package hw1;

public class Test {
	
	public static void main(String[] args) {
		
		Iron i1 = new Iron();
		Iron i2 = new Iron();
		
		Knife k = Tools.fun1(i1, i2);
		
		Tree tree = new Tree();
		
		Meteral m = k.cut(tree);
		
		Chire c = Tools.fun2(m);
		
	}

}
