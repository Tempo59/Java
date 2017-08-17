package test;

import transport.Fighting_Plane;
import transport.Tank;

public class Test {
	
	public static void main(String[] args) {
		
		Fighting_Plane fp = new Fighting_Plane("F22");
		fp.transport("ÎäÆ÷");
		fp.fly();
		fp.fire();
		
		Tank t = new Tank();
		System.out.println(t.getName());
		t.transport("»ğÒ©");
		t.run();
		t.fire();
		
	}

}
