package week1;

import java.util.Scanner;

public class Day5Exercise {
	
	public static void main(String[] args){
		fun3();
	}
    //����������Ȼ���������λ����?��С����ô����0.11
	public static void fun1(){
		System.out.print("������һ������:");
		Scanner number=new Scanner(System.in);
		int a=number.nextInt();
		while(true){
			int shang=a/10;
			int yu=a%10;
			a=shang;
			System.out.print(yu);
			if(shang==0){
				return;
			}
		}
		}
	//�ֱ���while��for���100��200֮���ż��
	public static void fun2(){
		int i=100;
		int sum1=0;
		while(i<=200){
			if(i%2==0){
				sum1+=i;
			}
			i++;
		}
		System.out.println("while������ܺ���:"+sum1);
		int sum2=0;
		for(int j=100;j<=200;j++){
			if(j%2==0){
				sum2+=j;
			}
		}
		System.out.println("for������ܺ���:"+sum2);
	}
	//����������ж������в�
	public static void fun3(){
		System.out.print("�������(0~100):");
		Scanner number=new Scanner(System.in);
		int a=number.nextInt();
		if(a>=90){
			System.out.println("����");
		}else if(a>=80){
			System.out.println("����");
			}else if(a>=60){
				System.out.println("�е�");
			}else{
				System.out.println("�");
			}
		}
	//����һ�������ж��ǲ�������������ֻ�ܱ��Լ���1������1�����������鿼Day5.java
	
	
	//
	
}
