package austincodedojo;

public class RomanNumerals {

	public static String toRoman(int numVal) {
		
		if(numVal >= 1000)
		{
			return toChars(numVal / 1000, new String[] {"M", "?"}) + toRoman(numVal % 1000);
		} else if (numVal >= 100) {
			return toChars(numVal / 100, new String[] {"C", "D"}) + toRoman(numVal % 100);
		} else if (numVal >= 10) {
			return  toChars(numVal / 10, new String[] {"X", "L"}) + toRoman(numVal % 10);
		} else {
			return toChars(numVal, new String[] {"I", "V"});
		}
	}

	private static String toChars(int numVal, String[] chars) {
		if (numVal == 0)
			return "";
		if (numVal == 4)
			return chars[0] + chars[1];
		if (numVal < 5)
			return chars[0] + toChars(numVal-1,chars) ;
		if (numVal == 9)
			return chars[0] + toRoman(numVal + 1);
		
		return chars[1] + toChars(numVal-5, chars);
	}

	private RomanNumerals() {
	}

}
