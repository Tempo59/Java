package transport;

public class Fighting_Plane extends Plane implements Fire {

	@Override
	public void fire() {
		System.out.println(name+"¿ª»ð¹¥»÷£ºpiupiupiu");
	}

	public Fighting_Plane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fighting_Plane(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int fun() {
		return 0;
		// TODO Auto-generated method stub
		
	}

}
