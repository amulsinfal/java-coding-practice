package programs;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String input = "Code to test";
		String[] words = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			if (i > 0) {
				sb.append(" ");
			}
		}
		
		System.out.println(sb);
	}

}
