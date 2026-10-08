package recursion_function;

public class Mani {
	
	public void recursion(int num) {
		if(num==11) {
			return;
		}
		System.out.println(num);
		recursion(num+1);
	}
	
	public void checkevenorodd(int num) {
		if(num==51) {
			return;
		}
		if(num%2==0) {
			System.out.println(num+" Even number");
		}else {
			System.out.println(num+" Odd number");
		}
		checkevenorodd(num+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mani m=new Mani();
		m.recursion(1);
		m.checkevenorodd(1);
	}

}
