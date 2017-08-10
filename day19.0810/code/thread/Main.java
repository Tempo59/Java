package thread;

public class Main extends Thread {
	
	public Main() {}
	public Main(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			System.out.println(
					currentThread().getName()
					+"----"+i);
		}
	}
	
	public static void main(String[] args) {
		
		Main m = new Main("Ï²ÑóÑó");
		m.setDaemon(true);
//		m.setDaemon(false);
		System.out.println(m.isDaemon());
		m.start();
		
		for(int i=0; i<=10; i++) {
			System.out.println(
					currentThread().getName()
					+"----"+i);
			yield();
		}
	}

}
