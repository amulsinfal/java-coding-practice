package programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String input = "swiss";
		char[] carr = input.toCharArray();

		Map<Character, Integer> freq = new LinkedHashMap<Character, Integer>();
		for (char c : carr) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		System.out.println(freq);

		for (Map.Entry<Character, Integer> e : freq.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}
	}
}
