package conditional_statement;

import java.util.Scanner;

public class Ifelseandswitch {
	
	public void switchcase() {
		int choice;
		Scanner sc=new Scanner(System.in);
		int result=0;
		do {
		
		System.out.println("----Calulator Application----");
		System.out.println("1.ADD");
		System.out.println("2.SUB");
		System.out.println("3.MUL");
		System.out.println("4.DIV");
		System.out.println("0.Exit");
		System.out.print("Enter your option : ");
		choice=sc.nextInt();
		int value1;
		int value2;
		switch(choice) {
		case 1:
			System.out.println("--ADD Function");
			System.out.println("Enter value 1: ");
			value1=sc.nextInt();
			System.out.println("Enter value 2: ");
			value2=sc.nextInt();
			
			result=value1+value2;
			System.out.println("Result: "+result);
			break;
		case 2:
			System.out.println("--SUB Function");
			System.out.println("Enter value 1: ");
			value1=sc.nextInt();
			System.out.println("Enter value 2: ");
			value2=sc.nextInt();
			
			result=value1-value2;
			System.out.println("Result: "+result);
			break;
			
		case 3:
			System.out.println("--MUL Function");
			System.out.println("Enter value 1: ");
			value1=sc.nextInt();
			System.out.println("Enter value 2: ");
			value2=sc.nextInt();
			
			result=value1*value2;
			System.out.println("Result: "+result);
			break;
		
		case 4:
			System.out.println("--DIV Function");
			System.out.println("Enter value 1: ");
			value1=sc.nextInt();
			System.out.println("Enter value 2: ");
			value2=sc.nextInt();
			
			result=value1/value2;
			System.out.println("Result: "+result);
			if(result%2==0) {
				System.out.println("Even");
			}else {
				System.out.println("ODD");
			}
			break;
		case 0:
			System.out.println("Application is stopped");
			break;
			
		default:
			System.out.println("Incorrect Option");
		}
		

		}while(choice!=0);
			
	}
	
	public void findindex(String name) {
		for(int i=0;i<name.length();i++) {
			System.out.println(i);
		}
	}

	public void loop() {
		// Normal for loop
		
		for(int i=10;i>=1;i--) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		// Enchansed for loop mainly used in arrays , lists, ..
		String[] arr= {"yuva","raj","arun","kumar"};
		for(String arrs:arr) {
			System.out.println(arrs);
		}
	}
}
