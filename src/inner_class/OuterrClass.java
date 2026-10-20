package inner_class;

public class OuterrClass {

	public void outermethod() {
		System.out.println("Outer class");
	}
	class Inner{
		public void display() {
			System.out.println("Inner Class");
		}
	}
	
	static class Inner1{
		public static void staticmethod() {
			System.out.println("Direct access");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterrClass outerclass = new OuterrClass();
		outerclass.outermethod();
		OuterrClass.Inner inner=outerclass.new Inner();
		inner.display();
		OuterrClass.Inner1.staticmethod();
		

	}

}
