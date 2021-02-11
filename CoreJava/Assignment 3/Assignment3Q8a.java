

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment3Q8a {
	public static void failFast(Map<String, String> cityCode) {
		Iterator<Entry<String, String>> hmIterator = cityCode.entrySet().iterator();
		while (hmIterator.hasNext()) {
			System.out.println(hmIterator.next());
			cityCode.put("Zanzibar", "5"); 
		}
	}

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Atlanta", "1");
		map.put("Georgia", "2");
		map.put("New York", "3");
		map.put("Seattle", "4");

		failFast(map);

	}
}