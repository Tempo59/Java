package runnable;

public class RunnableInpl implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"hello");
		System.out.println(Thread.currentThread().getName()+"I am LiLei");
	}
	

}
