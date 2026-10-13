package programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharaterInString {

	public static void findDuplicates(String str) {
		Map<Character, Integer> freq = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> c : freq.entrySet()) {
			if (c.getValue() > 1) {
				System.out.println(c.getKey() + "=" + c.getValue());
			}
		}
	}

	public static void main(String[] args) {
		findDuplicates("programming");
	}
}
