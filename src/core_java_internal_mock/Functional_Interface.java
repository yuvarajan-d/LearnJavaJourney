package core_java_internal_mock;

public class Functional_Interface{
	public static void main(String args[]) {
		Calculator c = (a, b) -> a + b;

        int result = c.add(10, 20);

        System.out.println("Sum = " + result);
	}
	

}
