package myBook;

public class Tools {
	
	//����Ų���ͼ��
	public static void searchById(Book[] books,int id) {
		for(Book b:books) {
			if(b.getId()==id) {
				System.out.println("�����"+id+"������"
						+b.getName()+"���۸���"
						+b.getPrice());
				break;
			}
		}
	}
	
	//���۸����ͼ��
	public static Book[] searchByPrice(Book[] books,double price) {
		//����
		int count = 0;
		for(Book b:books) {
			if(b.getPrice()==price) {
				count++;
			}
		}
		//����һ��������
		Book[] bs = new Book[count];
		//����һ����������ʾbs������±�
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











