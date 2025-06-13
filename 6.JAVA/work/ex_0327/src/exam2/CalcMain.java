package exam2;

public class CalcMain {
	
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(3, 4));
		int[] a = {8,4,3,5};
		System.out.println(c.average(a));
		System.out.println(c.substract(8, 4));
		
	}
}
