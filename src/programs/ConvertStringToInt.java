package programs;

public class ConvertStringToInt {
	public static int convert(String str) {
		if(str == null || str.isEmpty()) {
			return 0;
		}
		int result = 0;
		int sign = 1;
		int i = 0;
		if(str.charAt(0) =='-') {
			sign = -1;
			i = 1;
		} else if (str.charAt(0) == '+') {
			sign = 1;
			i = 1;
		}
		for(; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= '0' && c <='9') {
				result = result * 10 + (c - '0');
			} else {
				throw new NumberFormatException("Invalid character: " + c);
			}
		}
		return result * sign;
	}

	public static void main(String[] args) {
		System.out.println(convert("-5241"));
	}
}
