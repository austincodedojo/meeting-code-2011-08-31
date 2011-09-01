package austincodedojo;

public class RomanNumeral {

	int numVal = 0;
	
	public RomanNumeral(int i) {
		this.numVal = i;
	}
	
	@Override
	public String toString() {
		return toRomanNumeral(this.numVal);
	}

	private static String toRomanNumeral(int numVal) {
		if (numVal == 1)
			return "I";

		return toRomanNumeral(1) + toRomanNumeral(numVal -1);
	}

}
