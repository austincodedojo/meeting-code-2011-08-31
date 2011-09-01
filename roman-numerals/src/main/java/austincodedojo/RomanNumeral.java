package austincodedojo;


public class RomanNumeral {

	private static String[] LOOKUP = new String[] {"no zero", "I", "II", "III", "IV"};
	
	int numVal;
	
	public RomanNumeral(int i) {
		this.numVal = i;
	}
	
	@Override
	public String toString() {
		return toRomanNumeral(this.numVal);
	}

	private static String toRomanNumeral(int numVal) {
		return LOOKUP[numVal];
	}

}
