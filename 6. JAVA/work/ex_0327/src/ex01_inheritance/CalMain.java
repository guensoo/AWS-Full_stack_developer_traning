package ex01_inheritance;

public class CalMain {
	public static void main(String[] args) {
		CalPlus cPlus = new CalPlus();
		CalMinus cMinus = new CalMinus();
		
		System.out.println(cPlus.getResult(15, 15));
		System.out.println(cMinus.getResult(30, 15));
	}
	
}
