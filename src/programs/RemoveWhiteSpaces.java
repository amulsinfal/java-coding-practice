package programs;

public class RemoveWhiteSpaces {

	public static String removeSpace(String str) {
		if (str == null || str.isEmpty()) {
			return "Input provided is either null or empty";
		}
		System.out.println("Initial String: " + str);
		char[] carr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : carr) {
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.print("String after removing spaces: ");
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(removeSpace("a b\tc\nd"));
	}
}
