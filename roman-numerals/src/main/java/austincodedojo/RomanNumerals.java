package austincodedojo;

public class RomanNumerals {

	public static String toRoman(int numVal) {
		if (numVal < 10) {
			return toChars(numVal, new String[] {"I", "V"});
		} else if (numVal < 100) {
			return toChars(numVal / 10, new String[] {"X", "L"});
		} else if (numVal < 1000) {
			return toChars(numVal / 100, new String[] {"C", "D"});
		} else {
			return toChars(numVal / 1000, new String[] {"M", "?"});
		}
	}

	private static String toChars(int numVal, String[] chars) {
		if(numVal == 0)
			return "";
		if (numVal >= 1 && numVal < 5)
			return chars[0] + toChars(numVal-1,chars) ;
		if (numVal == 5)
			return chars[1];
		return null;
	}

	private RomanNumerals() {
	}

}
