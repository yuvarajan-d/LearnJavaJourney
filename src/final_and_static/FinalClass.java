package final_and_static;

public final class FinalClass {

	public final void finalmethod() {
		final int a=1;
		System.out.println("Final: "+a);
	}
	
	public void finalmethod(int a) {
		System.out.println("Overload: "+a);
	}
}
