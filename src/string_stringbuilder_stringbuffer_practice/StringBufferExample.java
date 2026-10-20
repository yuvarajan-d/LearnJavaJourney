package string_stringbuilder_stringbuffer_practice;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer transaction = new StringBuffer("Transaction Details:\n");
		transaction.append("Amount Rs.5000 deposited.\n");
		transaction.append("Amounnt Rs.2000 withdrawn.");
		System.out.println(transaction);
		
		// Both StringBuilder and StringBuffer are mutable class used for modifying Strings.
		// The main difference is that StringBuffer is thread-safe (Synchronized), while StringBuilder
		// is faster but not thread-safe.
	}

}
