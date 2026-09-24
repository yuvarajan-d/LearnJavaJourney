package typecasting;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// string to int
		String word="10";
		int value = Integer.valueOf(word);
		System.out.println(value);
		
		// int to string
		int a=10;
		String data=String.valueOf(a);
		int amount=100;
		System.out.println(data+amount);
		
		// char to string
		char ch='a';
		String chars=String.valueOf(ch);
		System.out.println(chars);
		
		//  int to float
		int datas=100;
		float point=(float) datas;
		System.out.println(point);
		
		// float to int
		float salary=25000.45f;
		int csalary=(int) salary;
		System.out.println(csalary);
		
		// string to boolean
		String c="true";
		boolean pass=Boolean.valueOf(c);
		System.out.println(pass);
		
		// int to double
		int s=90;
		double s1=Double.valueOf(s);
		System.out.println(s1);
		
		// double to int
		double money=112000.878745d;
		int money1=(int) money;
		System.out.println(money1);
		
		// string to double
		String fun="12000.8787545d";
		double fun1=Double.valueOf(fun);
		System.out.println(fun1);
		
		//boolean to string
		boolean yes=true;
		String no=String.valueOf(yes);
		System.out.println(no);
		
		// string to char
		String s3="a";
		char s4=s3.charAt(0);
		System.out.println(s4);
	

	}

}
