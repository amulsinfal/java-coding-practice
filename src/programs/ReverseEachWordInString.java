package programs;

public class ReverseEachWordInString {

	public static String reverseEachWord(String str) {
		String[] words = str.split(" ");
		String reversedString = "";

		for (String s : words) {
			String reversedWord = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				reversedWord += s.charAt(i);
			}
			reversedString += reversedWord + " ";
		}
		return reversedString.trim();
	}

	public static void main(String[] args) {
		System.out.println(reverseEachWord("Hello World"));
	}

}
