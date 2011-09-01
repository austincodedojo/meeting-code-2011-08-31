package austincodedojo;


public class RomanNumerals {

	private static String[] LOOKUP = new String[] {"no zero", "I", "II", "III", "IV"};
	
	public static String toRoman(int numVal) {
		return LOOKUP[numVal];
    }
	
	private RomanNumerals() {}

}
