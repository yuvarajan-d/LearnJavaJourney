package exception;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayIndexOutOfBoundsException
		try {
		int arr[]=new int[2];
		arr[0]=30;
		arr[1]=40;
		arr[2]=50;
		for(int i:arr) {
			System.out.println(i);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		// NullPointerException
		try {
		String name=null;
		System.out.println(name.length());
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		
		// Arithmetic Exception
		try {
			int value=10/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		// NumberFormatException
		try {
			String data="10G";
			int n=Integer.valueOf(data);
			System.out.println(n);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		
		Bank bank = new  Bank();
		bank.bank(3);
	}

}
