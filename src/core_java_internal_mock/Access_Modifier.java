package core_java_internal_mock;

public class Access_Modifier {
	private int a = 10;
    private int b = 25;
    private int c = 15;

    public void findLargest() {
        int sum = a + b + c; 
        System.out.println("Sum of three Numbers: "+sum);

        if (a >= b && a >= c) { 
            System.out.println("Largest = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } else {
            System.out.println("Largest = " + c);
        }
    }
    public static void main(String[] args) {
        Access_Modifier obj = new Access_Modifier();
        obj.findLargest();
    }
}
