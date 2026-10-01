package final_and_static;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalClass f=new FinalClass();
		System.out.println("");
		f.finalmethod();

		StaticClass.method();
		System.out.println(StaticClass.message);
	}

}
