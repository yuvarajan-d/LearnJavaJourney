package core_java_internal_mock;

import java.util.Scanner;

public class Fundamentals {
	
	static String college = "Sairam";
    final int id = 101;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Question - 1
		System.out.println("DataTypes and TypeCasting");
		int num = 10;
        double price = 25.5;
        char grade = 'A';
        boolean status = true;
        double value = num;
        int n = (int) price;

        System.out.println("Integer: " + num);
        System.out.println("Double: " + price);
        System.out.println("Character: " + grade);
        System.out.println("Boolean: " + status);
        System.out.println("Widening TypeCasting: " + value);
        System.out.println("Narrowing TypeCasting: " + n);
        
        System.out.println("");
        
        //Question - 2
        System.out.println("Check the number is positive negative or zero");
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        if(number>0) {
        	System.out.println("Positive Number");
        }else if(number<0) {
        	System.out.println("Negative Number");
        }else {
        	System.out.println("Zero");
        }
        
        System.out.println("");
        
        //Question - 3
        System.out.println("Factorial of Number");
        System.out.println("Find Factorial of the number: ");
        int Num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=Num;i++) {
        	fact=fact*i;
        }
        System.out.println("Factorial = "+ fact);
        
        System.out.println("");
        
        //Question - 4
        System.out.println("Static and final example.");
        Fundamentals f = new Fundamentals();
        System.out.println(f.id);
        System.out.println(college);
        
        System.out.println("");
        
        
        //Question - 5
        System.out.println("String comparison using == and equals()");
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s3==s4);
        
        sc.close();

	}

}
