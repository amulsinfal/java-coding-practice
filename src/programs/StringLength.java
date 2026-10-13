package programs;

public class StringLength {
	public static int findLength(String str) {
		if(str == null || str.isEmpty()) return 0;
		int count = 0;
		for (char c: str.toCharArray()) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Lenth is: " + findLength("Java") );
	}
}
