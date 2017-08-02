package week1;

import java.util.Scanner;

public class Day5Exercise {
	
	public static void main(String[] args){
		fun3();
	}
    //输入正数，然后倒序输出各位数字?正小数怎么处理，0.11
	public static void fun1(){
		System.out.print("请输入一个正数:");
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
	//分别用while和for输出100到200之间的偶数
	public static void fun2(){
		int i=100;
		int sum1=0;
		while(i<=200){
			if(i%2==0){
				sum1+=i;
			}
			i++;
		}
		System.out.println("while计算的总和是:"+sum1);
		int sum2=0;
		for(int j=100;j<=200;j++){
			if(j%2==0){
				sum2+=j;
			}
		}
		System.out.println("for计算的总和是:"+sum2);
	}
	//由输入分数判断优良中差
	public static void fun3(){
		System.out.print("输入分数(0~100):");
		Scanner number=new Scanner(System.in);
		int a=number.nextInt();
		if(a>=90){
			System.out.println("优秀");
		}else if(a>=80){
			System.out.println("良好");
			}else if(a>=60){
				System.out.println("中等");
			}else{
				System.out.println("差劲");
			}
		}
	//键入一个数，判断是不是素数，素数只能被自己和1整除，1不是素数，查考Day5.java
	
	
	//
	
}
