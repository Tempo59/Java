package myBook;

public class Book {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//˽�����Ա�ţ��������۸�
	private int id;
	private String name;
	private double price;
	
	private static int num = 1000;
	
	{
		id = ++num;
	}
	
	//���췽��
	public Book() {}
	public Book(String name,double price) {
		this.name = name;
		this.price = price;
	}

}







