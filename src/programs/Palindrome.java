package programs;

public class Palindrome {
	
	public static String isPalindrome_Method1(String inputString) {
		
		char[] charArray = inputString.toCharArray();
		String reversedString = "";
		
		for(int i = charArray.length - 1; i >=0 ; i--) {
			reversedString += charArray[i];
		}
		
		if(reversedString.equalsIgnoreCase(inputString)) {
			return inputString + " is a palindrome.";
		} else {
			return inputString + " is not a palindrome.";
		}		
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome_Method1("Madam"));
		System.out.println(isPalindrome_Method1("Wipro"));
	}
}
