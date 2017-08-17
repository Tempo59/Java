package myBook;

public class Tools {
	
	//按编号查找图书
	public static void searchById(Book[] books,int id) {
		for(Book b:books) {
			if(b.getId()==id) {
				System.out.println("编号是"+id+"，书名"
						+b.getName()+"，价格是"
						+b.getPrice());
				break;
			}
		}
	}
	
	//按价格查找图书
	public static Book[] searchByPrice(Book[] books,double price) {
		//计数
		int count = 0;
		for(Book b:books) {
			if(b.getPrice()==price) {
				count++;
			}
		}
		//创建一个新数组
		Book[] bs = new Book[count];
		//定义一个变量，表示bs数组的下标
		int j = 0;
		for(Book b:books) {
			if(b.getPrice()==price) {
				bs[j] = b;
				j++;
			}
		}
		return bs;
	}

}











