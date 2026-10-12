package programs;

public class VowelCount {

	public static void count(String str) {
		
		String v = "aeiou";
		int vowels = 0;
		int consonents = 0;

		for (char c : str.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				if (v.indexOf(c) != -1) {
					vowels++;
				} else {
					consonents++;
				}
			}
		}
		System.out.println("Vowels count: " + vowels);
		System.out.println("Consonents count: " + consonents);
	}

	public static void main(String[] args) {
		count("Selenium 4.0");
	}
}
