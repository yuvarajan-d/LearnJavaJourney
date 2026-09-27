package oops;

public interface Hide {
	
	public void team(String name);
	
	default void display() {
			
			System.out.println("hiiiiii");
	}
	
	private void good() {
		System.out.println("Bye.....");
	}
	
	static void day() {
		System.out.println("Mobile");
	}
	
	public static void main(String args[]) {
		Hide h=new Hide() {
			@Override
			public void team(String name) {
				System.out.println(name);
				
			}
		};
		h.display();
		h.good();
		h.team("laptop");
	}

}
