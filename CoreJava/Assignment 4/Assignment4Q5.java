import java.util.*;
import java.util.function.Consumer;

public class Assignment4Q5 {
	static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

	static StringBuffer sb = new StringBuffer();
	static Consumer<List<String>> modify = list -> {
		for (String s : list) {
			sb.append(s.charAt(0));
		}
	};

	public static String processWords(List<String> list) {

		modify.accept(list);
		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(processWords(list));
	}
}