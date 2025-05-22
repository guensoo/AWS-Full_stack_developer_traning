package ex04_overloading;

public class Converter {
	
	// cm -> m로 변환하는 convert
	public double convert(double cm) {
		return cm / 100.0;
	}
	// m,inch -> cm로 변환하는 convert
	// inch -> cm : inch * 2.54
	
	public double convert(double value, String unit) {
		if(unit.equals("m")) {
			return value * 100.0;
		} else if(unit.equals("inch")) {
			return value * 2.54;
		} else {
			return 0;
		}
	}
}
