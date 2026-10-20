package optional_class;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Yuvarajan";
		Optional<String> result = Optional.ofNullable(name);
		System.out.println(result.isPresent());
		System.out.println(result.isEmpty());
		
		Optional<String> result1=Optional.ofNullable("Yuvarajan");
		System.out.println("Same result:"+ result.equals(result1));
		
		ArrayList<String> data= new ArrayList<String>();
		data.add("info");
		data.add("term");
		data.add("collect");
		
		Optional<ArrayList<String>> team = Optional.ofNullable(data);
		System.out.println(team.isEmpty());
	
		
	}

}
