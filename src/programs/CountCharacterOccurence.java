package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharacterOccurence {

	public static void countChar(String str) {

		Map<Character, Integer> freq = new HashMap<>();
		for (char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		
		for(Entry<Character, Integer> e : freq.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
	}

	public static void main(String[] args) {
		countChar("automation");
	}

}
