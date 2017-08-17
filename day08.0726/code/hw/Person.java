package hw;

public class Person {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("张阿姨");
		Person p2 = new Person("李阿姨");
		Place p = new Place("物美超市");
		Goods g = new Goods("红富士");
		
		p1.buy(p2, p, g);
		
	}
	
	String name;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
	//买的方法
	public void buy(Person p,Place pla,Goods g) {
		System.out.println(this.name+"和"
				+p.name+"在"+pla.name+"买"+g.name);
	}

}




