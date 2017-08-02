package week1;

import java.util.Scanner;

public class Day5 {
	
	public static void main(String[] args){
		fun11();
	}
	
	public static void fun1(){
		System.out.println("请输入两个数");
		Scanner number1=new Scanner(System.in);
		Scanner number2=new Scanner(System.in);
		float a=number1.nextFloat();
		float b=number2.nextFloat();
		if(a>b){
			System.out.println("它们的大小顺序是:"+a+"      "+b);
		}else
		{
			System.out.println("它们的大小顺序是:"+b+"      "+a);
		}
		number1.close();
		number2.close();
	}
	
	public static void fun2(){
		System.out.println("输入一个数");
		Scanner number1=new Scanner(System.in);
		float a=number1.nextFloat();
		if(a<0){
			System.out.println("它的绝对值是:"+(-a));
		}else{
			System.out.println("它的绝对值是:"+a);
		}
		number1.close();
	}
	
	public static void fun3(){
		System.out.print("所有的水仙花数有:");
		for(int i=100;i<=999;i++){
			int a=i/100;
			int b=(i-a*100)/10;
			int c=i-a*100-b*10;
			if(i==(a*a*a+b*b*b+c*c*c)){
				System.out.print(i+"  ");
			}
		}
	}
	
	public static void fun4(){
		System.out.println("请输入一个年份");
		Scanner number1=new Scanner(System.in);
		int a=number1.nextInt();
		if(((a%4==0)&&(a%100!=0))||(a%400==0)){
			System.out.println(a+"是闰年");
		}
		number1.close();
	}
	
	public static void fun5(){
		System.out.println("请输入一个整数");
		Scanner number1=new Scanner(System.in);
		int a=number1.nextInt();
		int time=0;
		for(int i=1;i<=a;i++){
			if(a%i==0){
				time++;
			}
			}
		if(a==1){
			System.out.println(a+"不是素数");
		}else{
			if(time==2){
				System.out.println(a+"是素数");
			}else{
				System.out.println(a+"不是素数");
			}
		}
		
		number1.close();
	}
	
	public static void fun6(){
		System.out.println("请输入一个整数");
		Scanner number1=new Scanner(System.in);
		int a=number1.nextInt();
		int sum=0;
		for(int i=1;i<=a;i+=2){
			sum+=i;
		}
		System.out.println("1到这个数之间的所以奇数和为:"+sum);
		number1.close();
	}
	
	public static void fun7(){
		System.out.println("请输入一个整数");
		Scanner number1=new Scanner(System.in);
		int a=number1.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++){
			if(i%3==0||i%17==0){
				sum++;
			}
			}
		System.out.println("从1到这个数之间所有能被3或被17整除的数的个数为:"+sum);
		number1.close();
	}
	
	public static void fun8(){
		System.out.println("请输入一个整数");
		Scanner number1=new Scanner(System.in);
		int a=number1.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=a;i++){
			if(i%3==0||i%7==0){
				sum1++;
			}
			if(i%3==0&&i%7==0){
				sum2++;
			}
		}
		System.out.println("1到这个数之间所有能被7或3整除，但不能同时被这两个数整除的数的个数为:"+(sum1-sum2));
		number1.close();
	}
	
	//下面两个方法需要参数，才能实现功能
	public static void fun9(int...arr){
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++){
			if((arr[i])%2==0){
				sum1++;
			}else{
				sum2++;
			}
		}
		System.out.println("偶数的个数为:"+sum1);
		System.out.println("奇数的个数为:"+sum2);
	}
	
	public static void fun10(int a,int...arr){
		for(int i=0;i<arr.length;i++){
			int number=0;
			if(a==arr[i]){
				System.out.println("元素在数组的第"+(i+1)+"位");
				number++;
			}
			if(i==(arr.length-1)&&number==0){
				System.out.println("没有找到该元素");
			}
		}
	}
	
	public static void fun11(){
		System.out.println("输入年份:");
		Scanner number1=new Scanner(System.in);
		int year=number1.nextInt();
		System.out.println("输入月份:");
		Scanner number2=new Scanner(System.in);
		int month=number2.nextInt();
		if(year<1900){
			System.out.println("年份出错");
			number1.close();
			number2.close();
			return;
		}
		if(month<1&&month>12){
			System.out.println("月份出错");
			number1.close();
			number2.close();
			return;
		}
		System.out.print("星期日      ");
		System.out.print("星期一      ");
		System.out.print("星期二      ");
		System.out.print("星期三      ");
		System.out.print("星期四      ");
		System.out.print("星期五      ");
		System.out.println("星期六      ");
		int cdays=0;
		for(int fyear=1900;fyear<year;fyear++){
			if(((fyear%4==0)&&(fyear%100!=0))||fyear%400==0){
				cdays+=366;
			}else{
				cdays+=365;
			}
		}
		for(int fmonth=1;fmonth<month;fmonth++){
			if(fmonth==1||fmonth==3||fmonth==5||fmonth==7||fmonth==8||fmonth==10||fmonth==12){
				cdays+=31;
			}else if(fmonth==4||fmonth==6||fmonth==9||fmonth==11){
				cdays+=30;
			}else if(fmonth==2&&(((year%4==0)&&(year%100!=0))||year%400==0)){
				cdays+=29;
			}else{
				cdays+=28;
			}
		}
		int weekday=cdays%7;
		for(int i=0;i<=weekday;i++){
			System.out.print("      ");
		}
		int monthday=0;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			monthday=31;
		}else if(month==4||month==6||month==9||month==11){
			monthday=30;
		}else if(month==2&&(((year%4==0)&&(year%100!=0))||year%400==0)){
			monthday=29;
		}else{
			monthday=28;
		}
		for(int i=1;i<=monthday;i++){
			if(i<10){
				System.out.print(i+"     ");
				}else{
					System.out.print(i+"    ");	
				}
			if((i+1+weekday)%7==0){
				System.out.println();
			}
		number1.close();
		number2.close();
		}
	}

}
