package myBook;

public class Test {
	
	public static void main(String[] args) {
		
		Book[] books = {new Book("java�����", 98.6),
				new Book("java�̲�", 35.0),
				new Book("ʮ������", 35.0)};
		
		Tools.searchById(books, 1001);
		
		Book[] bs = Tools.searchByPrice(books, 35.0);
		System.out.println(bs.length);
		
		for(Book b:bs) {
			System.out.println("�����"+b.getId()+"������"
					+b.getName()+"���۸���"
					+b.getPrice());
		}
		
	}

}
