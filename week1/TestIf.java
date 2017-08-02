package week1;
import java.util.*;

public class TestIf {
	
	public static void main(String[] args){
		Scanner input1=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		int a=input1.nextInt();
		int b=input2.nextInt();
		if(a>0){
			System.out.println("正数");
		}
		else{
			System.out.println("负数");
		}
		input1.close();
		input2.close();
	}

}
