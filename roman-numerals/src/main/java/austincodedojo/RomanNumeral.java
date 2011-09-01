package austincodedojo;

public class RomanNumeral {

	int numVal = 0;
	
	public RomanNumeral(int i) {
		this.numVal = i;
	}
	
	@Override
	public String toString() {
		if(numVal==1){
			return "I";
		}
		else
			return "II";
	}

}
