package myBook;

public class Test {
	
	public static void main(String[] args) {
		
		Book[] books = {new Book("java疯狂讲义", 98.6),
				new Book("java教材", 35.0),
				new Book("十大神兽", 35.0)};
		
		Tools.searchById(books, 1001);
		
		Book[] bs = Tools.searchByPrice(books, 35.0);
		System.out.println(bs.length);
		
		for(Book b:bs) {
			System.out.println("编号是"+b.getId()+"，书名"
					+b.getName()+"，价格是"
					+b.getPrice());
		}
		
	}

}
