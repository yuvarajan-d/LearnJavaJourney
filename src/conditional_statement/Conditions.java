package conditional_statement;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Eneter your age: ");
//		int age =sc.nextInt();
//		String result=age>=18?"elgible to vote":"not elgible to vote";
////		System.out.println(age>18?"ELEGIBLE TO VOTE":"Not eligible to vote");
//		System.out.println(result);
//
//		System.out.println("Enter the number : ");
//		int num=sc.nextInt();
//		int res=num%2==0?1:0;
//		System.out.println("1 is  even and 0 is odd number: "+res);
//		
//		System.out.println("enter your name: ");
//		sc.nextLine();
//		String name=sc.nextLine();
//		// if i use scanner class and use == , output will not correct 
//		//because in the runtime memory is not created, 
//		//if use .equals => it will provide correct output because it check the content alone..
//		//if we declare name="yuva", if i run , it provide correct output, because it is compile-time,
//		//in compile-time memory will be create first.
//		int match=name.equals("yuva")?1:0;
//		System.out.println("Name: "+match);
		
		Ifelseandswitch ifelseandswitch=new Ifelseandswitch();
//		ifelseandswitch.switchcase();
//		ifelseandswitch.findindex("hello");
		ifelseandswitch.loop();
		
	}

}
