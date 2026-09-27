package conditional_statement_practice;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student mark: ");
		int mark=sc.nextInt();
		if(mark>=40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		String result=(num%2==0)?"Even":"Odd";
		System.out.println("The number is: "+result);
		
		
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not Eligible");
		}
		
		
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		int largest=(num1>num2)?num1:num2;
		System.out.println("The largest number is "+largest);
		
		
		System.out.println("Enter student score: ");
		int score=sc.nextInt();
		if(score>=90  && score<=100) {
			System.out.println("A Grade");
		}
		else if(score>=75 && score<=89) {
			System.out.println("B Grade");
		}
		else if(score>=50 && score<=74) {
			System.out.println("C Grade");
		}
		else if(score>=40 && score<=49) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail");
		}
		
		sc.close();
	}

}
