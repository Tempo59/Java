package hw;

public class Person {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("�Ű���");
		Person p2 = new Person("���");
		Place p = new Place("��������");
		Goods g = new Goods("�츻ʿ");
		
		p1.buy(p2, p, g);
		
	}
	
	String name;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
	//��ķ���
	public void buy(Person p,Place pla,Goods g) {
		System.out.println(this.name+"��"
				+p.name+"��"+pla.name+"��"+g.name);
	}

}




