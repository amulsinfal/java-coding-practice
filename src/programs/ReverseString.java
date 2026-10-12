package programs;

public class ReverseString {

	public static String reverse(String inputString) {
		System.out.println("Initial String: " + inputString);
		char[] charArray = inputString.toCharArray();
		String reversedString = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			reversedString += charArray[i];
		}
		return reversedString;
	}

	public static void main(String[] args) {
		System.out.println("Reversed String: " + reverse("automation"));
	}
}
