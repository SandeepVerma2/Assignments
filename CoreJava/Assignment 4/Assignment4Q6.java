import java.util.*;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Bambam");
		list.add("Canada");
		list.add("Delhi");
		list.add("Eng");
		
		Assignment4Q6 assign = new Assignment4Q6();
		
		System.out.println(assign.convertToUpperCase(list));
	}

	public List<String> convertToUpperCase(List<String> list) {

		UnaryOperator<String> toUpper = str -> str.toUpperCase();

		list.replaceAll(toUpper);

		return list;
	}

} 