package lambda_function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Interfaces inter=(int a, int b)->a+b;
		//System.out.println(inter.add(20,30);
		
		
		Interfaces inter=(int a, int b)->{
			System.out.println("Lambda function");
		
			return a+b;
		};
		System.out.println(inter.add(20,30));
	
		
		// It is not a lambda function, it's function definition for interface
//		Interfaces team=new Interfaces() {
//			
//			public void add() {
//				
//			}
//			
//			public void sub() {
//				
//			}
//		};
//		
//		team.add();
//		team.sub();
		
		
		
		
		
		Loop l=()->{
			for(int i=1;i<=10;i++) {
				System.out.println(i+" Lambda function");
			}
		};
		l.lambda();
		
	}

}
